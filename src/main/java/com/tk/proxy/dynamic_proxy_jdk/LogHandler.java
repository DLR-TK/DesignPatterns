package com.tk.proxy.dynamic_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        System.out.println("method: " + method.getName());
        Object o = method.invoke(tank, args);

        after();
        return o;
    }
}
