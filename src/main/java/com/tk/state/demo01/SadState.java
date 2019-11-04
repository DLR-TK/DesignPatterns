package com.tk.state.demo01;

public class SadState extends PersonState {
    @Override
    public void smile() {
        System.out.println("苦笑");
    }

    @Override
    public void cry() {
        System.out.println("嚎啕大哭");
    }

    @Override
    public void say() {
        System.out.println("恶语相向");
    }
}
