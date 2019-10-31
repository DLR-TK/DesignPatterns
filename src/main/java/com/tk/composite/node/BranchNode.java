package com.tk.composite.node;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分支
 */
@Data
public class BranchNode extends Node{
    private List<Node> nodeList = new ArrayList<>();

    private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void add(Node node) {
        nodeList.add(node);
    }

    public void remove(Node node) {
        nodeList.remove(node);
    }
}
