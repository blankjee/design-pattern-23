package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:37:37
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
