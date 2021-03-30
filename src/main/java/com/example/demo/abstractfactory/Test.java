package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:24:44
 */
public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new EnglandCarFactory();
        vehicle.toTravel();
    }
}
