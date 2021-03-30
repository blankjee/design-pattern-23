package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:42:10
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
