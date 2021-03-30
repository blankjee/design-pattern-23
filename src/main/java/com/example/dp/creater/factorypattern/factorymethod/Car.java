package com.example.dp.creater.factorypattern.factorymethod;

/**
 * @author blankjee
 * @date 2021/3/30 17:22:22
 */
public class Car extends CarFactory implements Vehicle {
    @Override
    public void toTravelInfo() {
        System.out.println("Choose car to travel");
    }
}
