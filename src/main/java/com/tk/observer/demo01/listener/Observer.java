package com.tk.observer.demo01.listener;

import com.tk.observer.demo01.event.WakeUpEvent;

public interface Observer {
    void actionOnWakeUp(WakeUpEvent wakeUpEvent);
}
