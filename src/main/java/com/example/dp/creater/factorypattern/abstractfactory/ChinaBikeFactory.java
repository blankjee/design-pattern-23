package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:07:18
 */
public class ChinaBikeFactory extends Bike {
    @Override
    public void toTravel() {
        System.out.println("In China, I will choose bike to travel.");
    }
}
