package com.tk.factory.abstractfactory.factory;

import com.tk.factory.abstractfactory.food.Food;
import com.tk.factory.abstractfactory.food.MushRoom;
import com.tk.factory.abstractfactory.vehicle.Broom;
import com.tk.factory.abstractfactory.vehicle.Vehicle;
import com.tk.factory.abstractfactory.weapon.MagicStick;
import com.tk.factory.abstractfactory.weapon.Weapon;

/**
 * 魔法工厂
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}
