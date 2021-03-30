package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:42:12
 */
public class EnglandFactory implements VehicleFactory {
    @Override
    public Vehicle bikeToTravel() {
        return new EnglandBikeFactory();
    }

    @Override
    public Vehicle carToTravel() {
        return new EnglandCarFactory();
    }
}
