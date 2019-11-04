package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 超时等待状态
 */
public class TimeWaitingState extends ThreadState {

    private Thread_ thread = null;

    public TimeWaitingState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * 休眠时间结束 进入就绪状态
         */
        if (input.msg.equals("End of time")) {
            thread.threadState = new RunnableState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("TimeWaiting---状态");
    }
}
