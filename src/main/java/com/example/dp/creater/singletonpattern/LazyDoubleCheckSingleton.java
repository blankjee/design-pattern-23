package com.example.dp.creater.singletonpattern;

/**
 * 为什么需要这样？
 * 实例化对象是有个过程的，要保证这个过程是有序且原子。
 * 1. 分配内存给这个对象
 * 2. 初始化对象
 * 3. 设置lazy指向刚刚分配的内存地址
 * 4. 初次访问对象
 * @author blankjee
 * @date 2021/3/30 10:51:57
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
