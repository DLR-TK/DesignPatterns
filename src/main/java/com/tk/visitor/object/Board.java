package com.tk.visitor.object;

import com.tk.visitor.visit.Visitor;

public class Board extends ComputerPart {

    private double price = 200;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
