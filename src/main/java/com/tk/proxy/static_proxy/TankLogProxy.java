package com.tk.proxy.static_proxy;

public class TankLogProxy implements Movable {

    private Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("Tank move start");
        movable.move();
        System.out.println("Tank stop");
    }
}
