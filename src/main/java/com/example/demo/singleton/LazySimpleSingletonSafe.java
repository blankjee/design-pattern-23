package com.example.demo.singleton;

/**
 * 懒汉单例模式-线程安全(加synchronized的前提下)
 * 懒汉：类加载时不初始化
 * @author blankjee
 * @date 2021/1/14 16:01:43
 */
public class LazySimpleSingletonSafe {

    private static LazySimpleSingletonSafe singletonSafe;

    private LazySimpleSingletonSafe() {

    }

    public synchronized static LazySimpleSingletonSafe getInstance() {
        if (singletonSafe == null) {
            singletonSafe = new LazySimpleSingletonSafe();
        }
        return singletonSafe;
    }
}
