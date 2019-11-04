package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 就绪状态
 */
public class RunnableState extends ThreadState {

    private Thread_ thread = null;

    public RunnableState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * 被调度器选中执行 进入执行状态
         */
        if (input.msg.equals("Selection")) {
            thread.threadState = new RunningState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("Runnable---状态");
    }
}
