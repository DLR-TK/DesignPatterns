package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 新建状态
 */
public class NewState extends ThreadState {

    private Thread_ thread = null;

    public NewState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * start() 执行线程
         */
        if (input.msg.equals("start()")) {
            thread.threadState = new RunnableState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("New---状态");
    }
}
