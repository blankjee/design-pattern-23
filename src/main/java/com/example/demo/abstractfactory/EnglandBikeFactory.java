package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:12:19
 */
public class EnglandBikeFactory extends Bike {
    @Override
    public void toTravel() {
        System.out.println("In England,I will Choose bike to travel");
    }
}
