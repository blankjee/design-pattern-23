package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:09:56
 */
public class EnglandBikeFactory extends Bike {
    @Override
    public void toTravel() {
        System.out.println("In England, I will choose bike to travel.");
    }
}
