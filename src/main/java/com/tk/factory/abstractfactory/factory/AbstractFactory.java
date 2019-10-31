package com.tk.factory.abstractfactory.factory;

import com.tk.factory.abstractfactory.food.Food;
import com.tk.factory.abstractfactory.vehicle.Vehicle;
import com.tk.factory.abstractfactory.weapon.Weapon;

public abstract class AbstractFactory {

    public abstract Food createFood();

    public abstract Weapon createWeapon();

    public abstract Vehicle createVehicle();
}
