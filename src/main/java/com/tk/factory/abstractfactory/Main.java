package com.tk.factory.abstractfactory;

import com.tk.factory.abstractfactory.factory.AbstractFactory;
import com.tk.factory.abstractfactory.factory.MagicFactory;
import com.tk.factory.abstractfactory.factory.ModernFactory;
import com.tk.factory.abstractfactory.food.Bread;
import com.tk.factory.abstractfactory.food.Food;
import com.tk.factory.abstractfactory.vehicle.Car;
import com.tk.factory.abstractfactory.vehicle.Vehicle;
import com.tk.factory.abstractfactory.weapon.AK47;
import com.tk.factory.abstractfactory.weapon.Weapon;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new MagicFactory();
        Vehicle vehicle = abstractFactory.createVehicle()  ;
        vehicle.go();
        Weapon weapon = abstractFactory.createWeapon();
        weapon.shoot();
        Food food = abstractFactory.createFood();
        food.printName();
    }
}
