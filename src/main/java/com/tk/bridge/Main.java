package com.tk.bridge;

public class Main {

    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
        System.out.println(gift);
    }
}
