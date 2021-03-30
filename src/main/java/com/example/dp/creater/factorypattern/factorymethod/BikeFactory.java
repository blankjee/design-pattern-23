package com.example.dp.creater.factorypattern.factorymethod;

/**
 * @author blankjee
 * @date 2021/3/30 17:20:57
 */
public class BikeFactory implements Factory {
    @Override
    public Vehicle toTravel() {
        return new Bike();
    }
}
