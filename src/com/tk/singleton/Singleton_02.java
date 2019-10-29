package com.tk.singleton;

/**
 * 懒汉(双重检查)
 */
public class Singleton_02 {
    private static volatile Singleton_02 INSTANCE;

    private Singleton_02() {}

    public static Singleton_02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_02.class) {
                if (INSTANCE == null) {
                    return INSTANCE = new Singleton_02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton_02.getInstance().hashCode());
            }).start();
        }
    }
}
