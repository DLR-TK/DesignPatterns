package com.tk.visitor.visit;

import com.tk.visitor.object.Board;
import com.tk.visitor.object.CPU;
import com.tk.visitor.object.Memory;
import lombok.Data;

@Data
public class CorpVisitor implements Visitor {

    private double totalPrice = 0.0;

    @Override
    public void visitCPU(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.7;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.75;
    }
}
