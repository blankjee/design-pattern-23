package com.example.demo.simplefactory;

/**
 * @author blankjee
 * @date 2021/1/14 17:29:15
 */
public class Truck extends Vehicle {

    public Truck(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Truck("Truck...");
    }
}
