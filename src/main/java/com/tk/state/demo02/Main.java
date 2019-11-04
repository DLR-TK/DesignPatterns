package com.tk.state.demo02;

/**
 * 模拟汽车四种状态(仅供练习，不考虑现实情景)
 *             open the door    close the door    run the car    stop the car
 * Open              x                 √               x               x
 * Closed            √                 x               x               x
 * Running           x                 x               x               √
 * Stopped           x                 x               √               x
 *
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car("奔驰", new RunningState());

        car.runTheCar();
        car.stopTheCar();
    }

}
