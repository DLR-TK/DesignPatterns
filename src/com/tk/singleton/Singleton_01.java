package com.tk.singleton;

/**
 * 饿汉
 */
public class Singleton_01 {
    private static final Singleton_01 INSTANCE = new Singleton_01();

    private Singleton_01() {}

    public static Singleton_01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton_01 singleton01 = Singleton_01.getInstance();
        Singleton_01 singleton02 = Singleton_01.getInstance();
        System.out.println(singleton01 == singleton02);
     }
}
