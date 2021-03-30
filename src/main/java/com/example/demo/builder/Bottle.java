package com.example.demo.builder;

/**
 * @author blankjee
 * @date 2021/1/14 20:33:30
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
