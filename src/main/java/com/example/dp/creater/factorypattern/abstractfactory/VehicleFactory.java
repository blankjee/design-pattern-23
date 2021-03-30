package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:12:29
 */
public interface VehicleFactory {
    // 实例化单车出行模式
    Vehicle bikeToTravel();
    // 实例化小汽车出行模式
    Vehicle carToTravel();
}
