package com.tk.state.thread.state;

import com.tk.state.thread.Action;

public abstract class ThreadState {

    public abstract void move(Action input);
    public abstract void run();
}
