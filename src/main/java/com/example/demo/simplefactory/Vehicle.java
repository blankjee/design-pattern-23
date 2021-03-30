package com.example.demo.simplefactory;

/**
 * @author blankjee
 * @date 2021/1/14 17:23:43
 */
public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println("Vehicle构造器：" + name);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract Vehicle newInstance();
}
