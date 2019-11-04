package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 阻塞状态
 */
public class BlockedState extends ThreadState{

    private Thread_ thread = null;

    public BlockedState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {
        if (input.msg.equals("Get lock")) { //获得锁 进入就绪状态
            thread.threadState = new RunnableState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("Blocked---状态");
    }
}
