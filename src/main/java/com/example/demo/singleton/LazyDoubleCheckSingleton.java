package com.example.demo.singleton;

/**
 * 懒汉式-双锁机制线程安全
 * 在私有成员变量的时候加上volatile关键字，初始化赋值null，真正的静态实例化方法中来个双重判断。
 * 安全且在多线程情况下能保持高性能。
 * @author blankjee
 * @date 2021/1/14 16:13:54
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {

    }

    /**
     * DCL，双检锁
     * 1. 分配内存给这个对象
     * 2. 初始化对象
     * 3. 设置lazy指向刚刚分配的内存地址
     * 4. 初次访问对象
     * @return
     */
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
