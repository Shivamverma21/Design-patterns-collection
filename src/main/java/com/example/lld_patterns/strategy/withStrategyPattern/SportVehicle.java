package com.example.lld_patterns.strategy.withStrategyPattern;

import com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies.SportDriveStrategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
