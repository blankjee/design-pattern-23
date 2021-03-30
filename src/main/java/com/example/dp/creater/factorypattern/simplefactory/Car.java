package com.example.dp.creater.factorypattern.simplefactory;

/**
 * @author blankjee
 * @date 2021/3/30 15:15:14
 */
public class Car extends Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Car:" + name;
    }

    @Override
    public Vehicle newInstance() {
        return new Car("Car ...");
    }
}
