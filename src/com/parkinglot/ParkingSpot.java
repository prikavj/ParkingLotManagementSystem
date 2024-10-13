package com.parkinglot;

import com.parkinglot.enums.SpotType;
import com.parkinglot.vehicle.Vehicle;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle;

    private SpotType spotType;

    public ParkingSpot(int spotNumber, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
