package com.tk.state.demo02;

public class RunningState extends CarState{
    @Override
    public void openTheDoor() {
        System.out.println("Unable to open door!!!");
    }

    @Override
    public void closeTheDoor() {
        System.out.println("Unable to close the door!!!");
    }

    @Override
    public void runTheCar() {
        System.out.println("Unable to run the car!!!");
    }

    @Override
    public void stopTheCar() {
        System.out.println("Stop the car.");
    }
}
