package com.tk.visitor.object;

import com.tk.visitor.visit.Visitor;

public class Memory extends ComputerPart {

    private double price = 300;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
