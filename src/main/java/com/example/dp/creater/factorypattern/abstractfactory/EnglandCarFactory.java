package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:11:18
 */
public class EnglandCarFactory extends Car {
    @Override
    public void toTravel() {
        System.out.println("In England, I will choose car to travel.");
    }
}
