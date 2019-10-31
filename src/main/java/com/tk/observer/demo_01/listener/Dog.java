package com.tk.observer.demo_01.listener;

import com.tk.observer.demo_01.event.WakeUpEvent;

public class Dog implements Observer{
    public void call() {
        System.out.println("dog call wang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        call();
    }
}
