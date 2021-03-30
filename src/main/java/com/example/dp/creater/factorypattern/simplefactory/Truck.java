package com.example.dp.creater.factorypattern.simplefactory;

/**
 * @author blankjee
 * @date 2021/3/30 15:18:22
 */
public class Truck extends Vehicle {

    public Truck(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Truck("Truck ...");
    }
}
