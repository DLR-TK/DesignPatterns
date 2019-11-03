package com.tk.Bridge;

public class Main {

    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
        System.out.println(gift);
    }
}
