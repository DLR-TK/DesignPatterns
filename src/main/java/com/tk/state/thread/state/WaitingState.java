package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 等待状态
 */
public class WaitingState extends ThreadState {

    private Thread_ thread = null;

    public WaitingState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * notify() notifyAll() LockSupport.unpark() 进入就绪状态
         */
        if (input.msg.equals("notify()") || input.msg.equals("notifyAll()")) {
            thread.threadState = new RunnableState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("Waiting---状态");
    }
}
