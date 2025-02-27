package com.example.lld_patterns.strategy.withStrategyPattern;

import com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        driveStrategy.drive();
    }
}
