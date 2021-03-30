package com.example.dp.creater.singletonpattern;

/**
 * @author blankjee
 * @date 2021/3/30 10:35:40
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
