package com.example.demo.singleton;

/**
 * 饿汉式单例模式-非静态代码块
 * 饿汉：类在加载的时候就立即初始化了，并创建单例对象。绝对线程安全，在线程还没有出现之前就已经实例化了，不可能存在访问安全问题。
 * @author blankjee
 * @date 2021/1/14 15:44:18
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
