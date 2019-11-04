package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 起源
 */
public class NoState extends ThreadState {

    private Thread_ thread = null;

    public NoState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * new一个新的线程
         */
        if (input.msg.equals("new")) {
            thread.threadState = new NewState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("未创建线程");
    }

}
