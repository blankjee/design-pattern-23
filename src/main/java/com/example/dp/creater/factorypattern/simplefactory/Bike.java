package com.example.dp.creater.factorypattern.simplefactory;

/**
 * @author blankjee
 * @date 2021/3/30 15:17:35
 */
public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Bike("Bike ...");
    }
}
