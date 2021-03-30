package com.example.demo.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author blankjee
 * @date 2021/1/14 17:31:51
 */
public class VehicleFactory {

    private Map<String, Vehicle> registerProducts = new HashMap<>();

    public Vehicle createVehicle(String vehicleName) {
        return registerProducts.get(vehicleName).newInstance();
    }

    public void registerVehicle(String vehicleName, Vehicle vehicle) {
        registerProducts.put(vehicleName, vehicle);
    }
}
