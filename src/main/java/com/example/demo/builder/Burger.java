package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:34:02
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
