package com.tk.state.demo02;

public class Car {

    private String name;
    private CarState carState;

    public Car(String name, CarState carState) {
        this.name = name;
        this.carState = carState;
    }

    public void openTheDoor() {
        carState.openTheDoor();
    }

    public void closeTheDoor() {
        carState.closeTheDoor();
    }

    public void runTheCar() {
        carState.runTheCar();
    }

    public void stopTheCar() {
        carState.stopTheCar();
    }
}
