package com.tk.singleton;

/**
 * 枚举(防止反序列化)
 */
public enum  Singleton_04 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton_04.INSTANCE.hashCode());
            }).start();
        }
    }
}
