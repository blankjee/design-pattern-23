package com.example.dp.creater.factorypattern.simplefactory;

/**
 * @author blankjee
 * @date 2021/3/30 15:08:18
 */
public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Vehicle: " + name;
    }

    abstract public Vehicle newInstance();
}
