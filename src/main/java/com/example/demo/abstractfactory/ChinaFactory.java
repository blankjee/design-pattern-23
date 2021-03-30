package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:18:57
 */
public class ChinaFactory implements VehicleFactory {
    @Override
    public Vehicle bikeToTravel() {
        return new ChinaBikeFactory();
    }

    @Override
    public Vehicle carToTravel() {
        return new ChinaCarFactory();
    }
}
