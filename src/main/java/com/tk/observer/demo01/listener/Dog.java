package com.tk.observer.demo01.listener;

import com.tk.observer.demo01.event.WakeUpEvent;

public class Dog implements Observer{
    public void call() {
        System.out.println("dog call wang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        call();
    }
}
