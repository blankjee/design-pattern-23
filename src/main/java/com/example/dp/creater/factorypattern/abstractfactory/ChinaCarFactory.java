package com.example.dp.creater.factorypattern.abstractfactory;

/**
 * @author blankjee
 * @date 2021/3/30 16:08:15
 */
public class ChinaCarFactory extends Car {
    @Override
    public void toTravel() {
        System.out.println("In China, I will choose car to travel.");
    }
}
