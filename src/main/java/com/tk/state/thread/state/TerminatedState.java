package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 死亡状态
 */
public class TerminatedState extends ThreadState {

    private Thread_ thread = null;

    public TerminatedState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * 线程消亡 回收资源
         */
        if (input.msg.equals("death")) {
            thread.threadState = null;
        }
    }

    @Override
    public void run() {
        System.out.println("Terminated---状态");
    }
}
