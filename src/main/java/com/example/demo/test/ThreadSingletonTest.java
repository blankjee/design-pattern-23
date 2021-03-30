package com.example.demo.test;

import com.example.demo.singleton.LazyDoubleCheckSingleton;
import com.example.demo.singleton.LazyInnerClassSingleton;
import com.example.demo.singleton.LazySimpleSingleton;

/**
 * @author blankjee
 * @date 2021/1/14 15:57:46
 */
public class ThreadSingletonTest implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        //LazyDoubleCheckSingleton lazy = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + lazy);
    }
}
