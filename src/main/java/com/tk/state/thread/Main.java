package com.tk.state.thread;

import com.tk.state.thread.state.NoState;

public class Main {

    public static void main(String[] args) {

        /**
         * 获取一个Thread初始实例(起源 Nostate)
         */
        Thread_ thread = new Thread_();
        thread.threadState = new NoState(thread);
        Action action = new Action();

        thread.run();

        action.msg = "new";
        thread.move(action);
        thread.run();

        action.msg = "start()";
        thread.move(action);
        thread.run();

        action.msg = "Selection";
        thread.move(action);
        thread.run();

        action.msg = "yield()";
        thread.move(action);
        thread.run();

        action.msg = "Selection";
        thread.move(action);
        thread.run();

        action.msg = "lock";
        thread.move(action);
        thread.run();

        action.msg = "Get lock";
        thread.move(action);
        thread.run();

        action.msg = "Selection";
        thread.move(action);
        thread.run();

        action.msg = "sleep(time)";
        thread.move(action);
        thread.run();

        action.msg = "End of time";
        thread.move(action);
        thread.run();

        action.msg = "Selection";
        thread.move(action);
        thread.run();

        action.msg = "wait()";
        thread.move(action);
        thread.run();

        action.msg = "notifyAll()";
        thread.move(action);
        thread.run();

        action.msg = "Selection";
        thread.move(action);
        thread.run();

        action.msg = "End";
        thread.move(action);
        thread.run();

    }
}
