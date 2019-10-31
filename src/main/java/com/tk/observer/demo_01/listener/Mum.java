package com.tk.observer.demo_01.listener;

import com.tk.observer.demo_01.event.WakeUpEvent;

public class Mum implements Observer {
    public void hug() {
        System.out.println("Mum hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }
}
