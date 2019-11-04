package com.tk.observer.demo01.event;

import com.tk.observer.demo01.object.Child;
import lombok.Data;

@Data
public class WakeUpEvent extends Event<Child> {
    private long timestamp;
    private String loc;
    private Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }

}
