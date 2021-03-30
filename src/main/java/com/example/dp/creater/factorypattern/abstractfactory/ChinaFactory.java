package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:19:28
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
