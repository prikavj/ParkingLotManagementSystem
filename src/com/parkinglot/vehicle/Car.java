package com.parkinglot.vehicle;

import com.parkinglot.enums.VehicleType;

public class Car extends Vehicle{

    public Car(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
}
