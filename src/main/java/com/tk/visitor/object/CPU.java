package com.tk.visitor.object;

import com.tk.visitor.visit.Visitor;

public class CPU extends ComputerPart {

    private double price = 500;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
