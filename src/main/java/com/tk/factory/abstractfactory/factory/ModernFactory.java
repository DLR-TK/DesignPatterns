package com.tk.factory.abstractfactory.factory;

import com.tk.factory.abstractfactory.food.Bread;
import com.tk.factory.abstractfactory.food.Food;
import com.tk.factory.abstractfactory.vehicle.Car;
import com.tk.factory.abstractfactory.vehicle.Vehicle;
import com.tk.factory.abstractfactory.weapon.AK47;
import com.tk.factory.abstractfactory.weapon.Weapon;

/**
 * 现代工厂
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
