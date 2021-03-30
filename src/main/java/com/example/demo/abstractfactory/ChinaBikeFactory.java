package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:09:03
 */
public class ChinaBikeFactory extends Bike {
    @Override
    public void toTravel() {
        System.out.println("In China, I will Choose bike to travel");
    }
}
