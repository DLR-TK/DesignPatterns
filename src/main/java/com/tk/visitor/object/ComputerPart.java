package com.tk.visitor.object;

import com.tk.visitor.visit.Visitor;

public abstract class ComputerPart {

    abstract public void accept(Visitor visitor);
    abstract public double getPrice();
}
