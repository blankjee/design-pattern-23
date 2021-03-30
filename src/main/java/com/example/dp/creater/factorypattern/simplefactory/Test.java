package com.example.dp.creater.factorypattern.simplefactory;

/**
 * @author blankjee
 * @date 2021/3/30 15:23:19
 */
public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("A car") {
            @Override
            public Vehicle newInstance() {
                return new Car("audi");
            }
        };
    }
}
