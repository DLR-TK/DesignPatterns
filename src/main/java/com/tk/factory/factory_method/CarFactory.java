package com.tk.factory.factory_method;

import com.tk.factory.abstractfactory.vehicle.Car;

public class CarFactory {
    public Car create() {
        System.out.println("Car created");
        return new Car();
    }
}
