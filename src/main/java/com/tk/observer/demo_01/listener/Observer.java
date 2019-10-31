package com.tk.observer.demo_01.listener;

import com.tk.observer.demo_01.event.WakeUpEvent;

public interface Observer {
    void actionOnWakeUp(WakeUpEvent wakeUpEvent);
}
