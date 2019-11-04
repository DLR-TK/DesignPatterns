package com.tk.singleton;

/**
 * 静态内部类
 */
public class Singleton03 {
    private Singleton03() {}

    private static class Singleton_03Holder {
        private final static Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return Singleton_03Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
