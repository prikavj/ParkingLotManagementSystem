# ParkingLotManagementSystem
A simple Java-based parking lot management system that supports different types of vehicles (Cars, Bikes, Trucks), parking spot allocation, and fee calculation based on parking duration. Built using object-oriented programming (OOP) principles like encapsulation, inheritance, and polymorphism.

### Overview
The Parking Lot Management System is a simple object-oriented implementation of a parking lot system that manages the parking of vehicles, tracks available spots, and calculates parking fees based on vehicle type and time spent in the parking lot. The system supports multiple vehicle types, including Cars, Bikes, and Trucks. It follows Object-Oriented Programming (OOP) principles, leveraging concepts like encapsulation, inheritance, polymorphism, and abstraction.

### Features
- Park different types of vehicles: Cars, Bikes, Trucks.
- Assign parking spots based on vehicle type.
- Calculate parking fees based on the time a vehicle spends in the parking lot.
- Different types of parking spots: Compact and Large.
- Issue tickets for parked vehicles and manage their entry and exit.

### Design Principles
- Encapsulation: Each class hides its internal state and exposes behavior through methods.
- Inheritance: Common properties and methods for vehicles are abstracted in a base class Vehicle, and specific vehicle types (Car, Bike, Truck) extend this class.
- Polymorphism: The system treats different types of vehicles uniformly using the base class, Vehicle.
- Abstraction: Simplified representation of the parking lot, vehicles, and parking spots.

### Class Structure
####  Main Components:
1. ParkingLot: Manages parking spots, vehicle entry/exit, and tickets.
2. ParkingSpot: Represents an individual parking spot with a type (Compact, Large).
3. Vehicle: Base class for vehicles, extended by specific vehicle types.
4. Ticket: Represents the parking ticket, storing the vehicle and its entry time.
5. ParkingFeeCalculator: Calculates fees based on the vehicle's type and duration of parking.

#### Vehicle Types:
1. Car: Inherits from Vehicle.
2. Bike: Inherits from Vehicle.
3. Truck: Inherits from Vehicle.

#### Parking Spot Types:
1. Compact Spot: Suitable for Cars and Bikes.
2. Large Spot: Suitable for Trucks.

#### Enum Types:
1. VehicleType: Enum for vehicle types (CAR, BIKE, TRUCK).
2. SpotType: Enum for parking spot types (COMPACT, LARGE).
