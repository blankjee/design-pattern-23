package com.example.demo.abstractfactory;

/**
 * @author blankjee
 * @date 2021/1/14 20:09:03
 */
public class ChinaCarFactory extends Car {
    @Override
    public void toTravel() {
        System.out.println("In China, I will Choose car to travel");
    }
}
