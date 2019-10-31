package com.tk.observer.demo_01.object;

import com.tk.observer.demo_01.event.WakeUpEvent;
import com.tk.observer.demo_01.listener.Dad;
import com.tk.observer.demo_01.listener.Dog;
import com.tk.observer.demo_01.listener.Mum;
import com.tk.observer.demo_01.listener.Observer;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }


    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(),"bed", this);
        cry = true;
        for (Observer observer: observers) {
            observer.actionOnWakeUp(wakeUpEvent);
        }
    }
}
