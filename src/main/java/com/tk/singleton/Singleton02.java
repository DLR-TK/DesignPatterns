package com.tk.singleton;

/**
 * 懒汉(双重检查)
 */
public class Singleton02 {
    private static volatile Singleton02 INSTANCE;

    private Singleton02() {}

    public static Singleton02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton02.class) {
                if (INSTANCE == null) {
                    return INSTANCE = new Singleton02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }
}
