package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:56:23
 */
public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new EnglandCarFactory();
        vehicle.toTravel();
    }
}
