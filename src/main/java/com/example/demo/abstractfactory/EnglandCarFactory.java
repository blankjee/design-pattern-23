package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:12:57
 */
public class EnglandCarFactory extends Car {
    @Override
    public void toTravel() {
        System.out.println("In England,I will choose car to travel");
    }
}
