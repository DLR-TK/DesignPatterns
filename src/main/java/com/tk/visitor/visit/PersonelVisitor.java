package com.tk.visitor.visit;

import com.tk.visitor.object.Board;
import com.tk.visitor.object.CPU;
import com.tk.visitor.object.Memory;
import lombok.Data;

@Data
public class PersonelVisitor implements Visitor {

    private double totalPrice = 0.0;

    @Override
    public void visitCPU(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}
