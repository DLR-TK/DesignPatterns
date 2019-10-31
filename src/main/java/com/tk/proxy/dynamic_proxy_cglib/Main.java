package com.tk.proxy.dynamic_proxy_cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * cglib实现动态代理不需要接口
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
        tank.move();
    }
}
