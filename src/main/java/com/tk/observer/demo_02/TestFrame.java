package com.tk.observer.demo_02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame {

    public void launch() {
        Button button = new Button("press me");
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener2());
        this.add(button);
        this.pack();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
        this.setLocation(400,400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }
}


class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("this is MyActionListener");
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("this is MyActionListener2");
    }
}