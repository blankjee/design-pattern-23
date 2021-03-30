package com.example.dp.creater.factorypattern.factorymethod;

/**
 * @author blankjee
 * @date 2021/3/30 17:21:39
 */
public class Bike extends BikeFactory implements Vehicle {
    @Override
    public void toTravelInfo() {
        System.out.println("Choose bike to travel");
    }
}
