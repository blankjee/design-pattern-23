package com.example.demo.simplefactory;

/**
 * @author blankjee
 * @date 2021/1/14 17:25:25
 */
public class Car extends Vehicle {

    private String name;

    public Car(String name) {
        super(name);
        System.out.println("Car类构造器：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Vehicle newInstance() {
        return new Car("Car ...");
    }
}
