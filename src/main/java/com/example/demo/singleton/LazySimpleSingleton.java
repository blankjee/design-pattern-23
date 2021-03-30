package com.example.demo.singleton;

/**
 * 懒汉单例模式-线程不安全(不加synchronized的前提下)
 * 懒汉：类加载时不初始化
 * @author blankjee
 * @date 2021/1/14 15:49:58
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {

    }
    // 静态代码块，公共内存区域。
    private static LazySimpleSingleton lazySimpleSingleton;

    public /*synchronized*/ static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
