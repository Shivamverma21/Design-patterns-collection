package com.example.lld_patterns.strategy.withStrategyPattern;

import com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
