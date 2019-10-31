package com.tk.observer.demo_01.listener;

import com.tk.observer.demo_01.event.WakeUpEvent;

public class Dad implements Observer{
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}
