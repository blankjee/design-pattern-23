package com.example.dp.creater.singletonpattern;

/**
 * 这种形式兼顾了饿汉式的内存浪费，也兼顾了Synchronized的性能问题
 * @author blankjee
 * @date 2021/3/30 11:15:18
 */
public class LazyInnerClassSingleton {

    // 默认使用LazyInnerClass的时候，会先初始化内部类
    // 如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // static是为了使单例的空间共享，final保证这个方法不会被重写重载
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
