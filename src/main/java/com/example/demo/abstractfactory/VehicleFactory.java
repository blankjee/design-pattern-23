package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:17:30
 */
public interface VehicleFactory {

    // 实例化单车出行模式
    public Vehicle bikeToTravel();
    // 实例化汽车出行模式
    public Vehicle carToTravel();
}
