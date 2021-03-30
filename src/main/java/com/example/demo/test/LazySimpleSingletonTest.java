package com.example.demo.test;

/**
 * @author blankjee
 * @date 2021/1/14 15:59:17
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        System.out.println("================");
        for (int i = 0; i < 1000000; i++) {
            Thread t = new Thread(new ThreadSingletonTest());
            t.start();
        }
        System.out.println("===============");
    }
}
