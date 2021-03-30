package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:36:12
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
