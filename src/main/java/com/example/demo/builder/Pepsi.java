package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:42:44
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
