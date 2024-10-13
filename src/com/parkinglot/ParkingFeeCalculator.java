package com.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingFeeCalculator {

    private static final int CAR_RATE = 10; // per hour
    private static final int BIKE_RATE = 5; // per hour
    private static final int TRUCK_RATE = 15; // per hour

    public static int calculateFee(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        Duration duration = Duration.between(entryTime, LocalDateTime.now());
        long hours = duration.toHours();

        if (hours == 0) {
            hours = 1;
        }

        switch (ticket.getVehicle().getType()) {
            case CAR:
                return (int) (hours * CAR_RATE);

            case BIKE:
                return (int) (hours * BIKE_RATE);

            case TRUCK:
                return (int) (hours * TRUCK_RATE);

            default:
                return 0;
        }

    }
}
