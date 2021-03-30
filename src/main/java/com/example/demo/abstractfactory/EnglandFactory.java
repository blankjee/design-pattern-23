package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:22:07
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
