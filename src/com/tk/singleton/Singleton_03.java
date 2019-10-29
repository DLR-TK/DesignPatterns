package com.tk.singleton;

/**
 * 静态内部类
 */
public class Singleton_03 {
    private Singleton_03() {}

    private static class Singleton_03Holder {
        private final static Singleton_03 INSTANCE = new Singleton_03();
    }

    public static Singleton_03 getInstance() {
        return Singleton_03Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton_03.getInstance().hashCode());
            }).start();
        }
    }
}
