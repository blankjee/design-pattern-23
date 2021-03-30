package com.example.demo.simplefactory;

/**
 * @author blankjee
 * @date 2021/1/14 17:28:19
 */
public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Bike("Bike...");
    }
}
