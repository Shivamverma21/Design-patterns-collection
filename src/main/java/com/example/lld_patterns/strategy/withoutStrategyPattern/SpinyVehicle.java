package com.example.lld_patterns.strategy.withoutStrategyPattern;

public class SpinyVehicle {
    public static void main(String[] args) {
        Vehicle generalVehicle = new Vehicle();
        generalVehicle.drive();
        Vehicle goodVehicle = new GoodVehicle();
        goodVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        Vehicle sportVehicle = new SportVehicle();
        sportVehicle.drive();
    }
}
