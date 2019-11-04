package com.tk.observer.demo01;

import com.tk.observer.demo01.object.Child;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();

        while (!child.isCry()) {
            System.out.println("observing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            child.wakeUp();
        }
    }
}
