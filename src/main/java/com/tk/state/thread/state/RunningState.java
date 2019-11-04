package com.tk.state.thread.state;

import com.tk.state.thread.Action;
import com.tk.state.thread.Thread_;

/**
 * 运行状态
 */
public class RunningState extends ThreadState {

    private Thread_ thread = null;

    public RunningState(Thread_ thread) {
        this.thread = thread;
    }

    @Override
    public void move(Action input) {

        /**
         * 线程运行结束
         */
        if (input.msg.equals("End")) {
            thread.threadState = new TerminatedState(thread);
        }

        /**
         * 执行yield()方法或者时间片用完 进入就绪状态
         */
        if (input.msg.equals("yield()")) {
            thread.threadState = new RunnableState(thread);
        }

        /**
         * 等待进入同步代码块的锁 进入阻塞状态
         */
        if (input.msg.equals("lock")) {
            thread.threadState = new BlockedState(thread);
        }

        /**
         * sleep(time) wait(time) join(time) LockSupport.parkNanos() LockSupport.parkUntil()
         * 进入休眠状态
         */
        if (input.msg.equals("sleep(time)")) {
            thread.threadState = new TimeWaitingState(thread);
        }

        /**
         * 调用wait() or join() or  LockSupport.park() 进入等待状态
         */
        if (input.msg.equals("wait()") || input.equals("join()")) {
            thread.threadState = new WaitingState(thread);
        }
    }

    @Override
    public void run() {
        System.out.println("---Running---状态");
    }
}
