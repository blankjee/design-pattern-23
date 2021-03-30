package com.example.dp.creater.factorypattern.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author blankjee
 * @date 2021/3/30 15:20:11
 */
public class VehicleFactory {

    private Map<String, Vehicle> registeredProducts = new HashMap<>();

    public Vehicle createVehicle(String vehicleName) {
        return registeredProducts.get(vehicleName).newInstance();
    }

    public void registerVehicle(String vehicleName, Vehicle vehicle) {
        registeredProducts.put(vehicleName, vehicle);
    }
}
