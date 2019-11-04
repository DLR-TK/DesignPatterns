package com.tk.templatemethod;

public abstract class Father {
    public void m() {
        op1();
        op2();
    }

    public abstract void op1();

    public abstract void op2();
}
