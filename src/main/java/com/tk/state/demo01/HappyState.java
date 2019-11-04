package com.tk.state.demo01;

public class HappyState extends PersonState {
    @Override
    public void smile() {
        System.out.println("开怀大笑");
    }

    @Override
    public void cry() {
        System.out.println("笑哭");
    }

    @Override
    public void say() {
        System.out.println("甜言蜜语");
    }
}
