package com.example.dp.creater.factorypattern.factorymethod;

/**
 * @author blankjee
 * @date 2021/3/30 17:22:59
 */
public class Test {

    public static void main(String[] args) {
        Factory bikeFactory = new BikeFactory();
        bikeFactory.toTravel().toTravelInfo();

        System.out.println("===========================");

        Factory carFactory = new CarFactory();
        carFactory.toTravel().toTravelInfo();
    }
}
