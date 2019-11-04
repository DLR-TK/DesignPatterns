package com.tk.state.thread;

import com.tk.state.thread.state.ThreadState;

public class Thread_ {
    public ThreadState threadState;

    public void move(Action input) {
        threadState.move(input);
    }

    public void run() {
        threadState.run();
    }
}
