package com.tk.proxy.spring_aop.demo_02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TimeProxy {

    @Before("execution(void com.tk.proxy.spring_aop.demo_02.Tank.move())")
    public void before() {
        System.out.println("method start---" + System.currentTimeMillis());
    }

    @After("execution(void com.tk.proxy.spring_aop.demo_02.Tank.move())")
    public void after() {
        System.out.println("method stop---" + System.currentTimeMillis());
    }
}
