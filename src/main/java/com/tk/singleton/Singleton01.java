package com.tk.singleton;

/**
 * 饿汉
 */
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton01 == singleton02);
     }
}
