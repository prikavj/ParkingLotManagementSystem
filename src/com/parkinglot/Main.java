package com.parkinglot;

import com.parkinglot.vehicle.Bike;
import com.parkinglot.vehicle.Car;
import com.parkinglot.vehicle.Truck;
import com.parkinglot.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        Vehicle car1 = new Car("ABC123");
        Vehicle bike1 = new Bike("BIKE001");
        Vehicle truck1 = new Truck("TRUCK999");

        Ticket carTicket = parkingLot.parkVehicle(car1);
        Ticket bikeTicket = parkingLot.parkVehicle(bike1);
        Ticket truckTicket = parkingLot.parkVehicle(truck1);

        // Simulate some time passing...
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int carFee = ParkingFeeCalculator.calculateFee(carTicket);
        System.out.println("Car parking fee: $" + carFee);

        parkingLot.exitVehicle(carTicket);
        parkingLot.exitVehicle(bikeTicket);
        parkingLot.exitVehicle(truckTicket);
    }
}
