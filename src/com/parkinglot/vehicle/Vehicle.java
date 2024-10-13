package com.parkinglot.vehicle;

import com.parkinglot.enums.VehicleType;

public class Vehicle {
    private String licensePlate;
    private VehicleType type;


    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }


}
