package com.example.dp.creater.singletonpattern;

/**
 * @author blankjee
 * @date 2021/3/30 10:44:13
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {

    }

    private static LazySimpleSingleton lazy = null;

    public /*synchronized*/ static LazySimpleSingleton getInstanceUnsafe() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    public synchronized static LazySimpleSingleton getInstanceSafe() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
