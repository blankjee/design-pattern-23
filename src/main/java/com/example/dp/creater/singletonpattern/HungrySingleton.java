package com.example.dp.creater.singletonpattern;

/**
 * 懒汉式
 * @author blankjee
 * @date 2021/3/30 10:31:48
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
