package com.example.demo.singleton;

/**
 * 饿汉式单例模式-静态代码块
 * @author blankjee
 * @date 2021/1/14 15:47:25
 */
public class HungrySingletonStatic {

    private static final HungrySingletonStatic hungrySingleton;
    static {
        hungrySingleton = new HungrySingletonStatic();
    }

    private HungrySingletonStatic() {

    }

    public static HungrySingletonStatic getInstance() {
        return hungrySingleton;
    }
}
