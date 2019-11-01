package com.tk.visitor.visit;

import com.tk.visitor.object.Board;
import com.tk.visitor.object.CPU;
import com.tk.visitor.object.Memory;

public interface Visitor {

    void visitCPU(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}
