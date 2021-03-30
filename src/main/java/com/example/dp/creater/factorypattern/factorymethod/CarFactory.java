package com.example.dp.creater.factorypattern.factorymethod;

/**
 * @author blankjee
 * @date 2021/3/30 17:19:48
 */
public class CarFactory implements Factory {
    @Override
    public Vehicle toTravel() {
        return new Car();
    }
}
