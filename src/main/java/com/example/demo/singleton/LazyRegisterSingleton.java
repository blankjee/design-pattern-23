package com.example.demo.singleton;

/**
 * 登记式/静态内部类
 * 这种方式能达到双检锁一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。这种方式同样利用了ClassLoader方式来保证初始化instance时
 * 只有一个线程，它跟饿汉式单例模式静态代码块实现不同的是：饿汉式单例模式只要Singleton类被装载了，instance就会被实例化，没有达到Lazy Loading，
 * 而这种方式是外部类被装载了，instance并没有被初始化。因为SingletonHolder没有主动使用，只有通过显式调用getInstance方法时，才会显式的装载，
 * 从而实例化instance。
 * @author blankjee
 * @date 2021/1/14 16:25:02
 */
public class LazyRegisterSingleton {

    private static class SingletonHolder {
        private static final LazyRegisterSingleton INSTANCE = new LazyRegisterSingleton();
    }

    private LazyRegisterSingleton() {

    }

    public static final LazyRegisterSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
