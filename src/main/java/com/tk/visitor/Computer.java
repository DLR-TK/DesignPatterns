package com.tk.visitor;

import com.tk.visitor.object.Board;
import com.tk.visitor.object.CPU;
import com.tk.visitor.object.ComputerPart;
import com.tk.visitor.object.Memory;
import com.tk.visitor.visit.CorpVisitor;
import com.tk.visitor.visit.PersonelVisitor;
import com.tk.visitor.visit.Visitor;

public class Computer {

    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor visitor) {
        this.cpu.accept(visitor);
        this.memory.accept(visitor);
        this.board.accept(visitor);
    }

    public static void main(String[] args) {
        CorpVisitor visitor = new CorpVisitor();
        new Computer().accept(visitor);
        System.out.println(visitor.getTotalPrice());
    }
}
