package com.tk.proxy.dynamic_proxy_jdk;

import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * JDK动态代理
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Tank tank = new Tank();
        //将JDK动态代理生成的class文件保存本地 新版JDK使用：System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //reflection 反射 通过二进制字节码分析类的属性和方法

        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(tank));
        movable.move();
    }
}
