package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:41:26
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
