package com.tk.factory.factory_method;

import com.tk.factory.abstractfactory.vehicle.Car;

/**
 * 简单工厂 可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
