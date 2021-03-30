package com.example.demo.singleton;

/**
 * 懒汉式单例-效率最高且线程安全的实现方式，最牛的单例模式实现。
 * 兼顾了饿汉式的内存浪费，也兼顾了synchronized性能问题
 * @author blankjee
 * @date 2021/1/14 16:45:33
 */
public class LazyInnerClassSingleton {

    /**
     * 内部类，默认不主动加载的。
     * @return
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    /**
     * 使用的话会加载内部类
     * @return
     */
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    /**
     * static为了使单例空间共享
     * final保证这个方法不会被重写
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }
}
