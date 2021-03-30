package com.example.demo.singleton;

/**
 * 枚举实现单例模式
 * 没有被广泛采用，这也是实现单例模式的最佳方案。简洁、自动支持序列化机制，绝对防止多次实例化。
 * @author blankjee
 * @date 2021/1/14 17:02:19
 */
public enum EnumSingleton {
    Instance;
    public void doSomething() {
        System.out.println("Something has been done");
    }
}
