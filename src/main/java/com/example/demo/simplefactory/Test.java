package com.example.demo.simplefactory;

/**
 * @author blankjee
 * @date 2021/1/14 17:34:37
 */
public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("A Car") {
            @Override
            public Vehicle newInstance() {
                return new Car(" audi ");
            }
        };

        System.out.println("==========================");
        Vehicle vehicle1 = new Car("A Car");
        System.out.println("==========================");
        System.out.println(vehicle.toString());
        System.out.println("==========================");
        System.out.println(vehicle1.toString());
    }
}
