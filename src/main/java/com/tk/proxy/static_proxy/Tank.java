package com.tk.proxy.static_proxy;

import java.util.Random;

public class Tank implements Movable{

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
        new TankLogProxy(
                new TankTimeProxy(
                        new Tank())).move();
    }
}
