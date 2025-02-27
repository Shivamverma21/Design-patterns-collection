package com.example.lld_patterns.strategy.withStrategyPattern;

public class SpinyVehicle {
    public static void main(String[] args) {
        Vehicle goodVehicle = new GoodVehicle();
        goodVehicle.drive();
        Vehicle sportVehicle = new SportVehicle();
        sportVehicle.drive();
        Vehicle normalVehicle = new GeneralVehicle();
        normalVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
