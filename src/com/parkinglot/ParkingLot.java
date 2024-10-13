package com.parkinglot;

import com.parkinglot.enums.SpotType;
import com.parkinglot.enums.VehicleType;
import com.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private List<Ticket> tickets;

    public ParkingLot() {
        spots = new ArrayList<>();
        tickets = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                spots.add(new ParkingSpot(i, SpotType.COMPACT));
            } else {
                spots.add(new ParkingSpot(i, SpotType.LARGE));
            }
        }
    }

    private boolean canPark(ParkingSpot spot, VehicleType vehicleType) {
        if (vehicleType == VehicleType.BIKE && spot.getSpotType() == SpotType.COMPACT) {
            return true;
        }
        if (vehicleType == VehicleType.CAR && spot.getSpotType() == SpotType.COMPACT) {
            return true;
        }
        if (vehicleType == VehicleType.TRUCK && spot.getSpotType() == SpotType.LARGE) {
            return true;
        }
        return false;
    }


    private ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() && canPark(spot, vehicleType)) {
                return spot;
            }
        }

        return null;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getType());

        if (spot == null) {
            System.out.println("No available spots for vehicle type: " + vehicle.getType());
        }

        spot.parkVehicle(vehicle);

        Ticket ticket = new Ticket(vehicle, spot);
        tickets.add(ticket);

        System.out.println("Vehicle parked: " + vehicle.getLicensePlate());

        return ticket;
    }

    public void exitVehicle(Ticket ticket) {
        ParkingSpot spot = ticket.getSpot();

        spot.removeVehicle();
        tickets.remove(ticket);
        System.out.println("Vehicle exited: " + ticket.getVehicle().getLicensePlate());
    }
}
