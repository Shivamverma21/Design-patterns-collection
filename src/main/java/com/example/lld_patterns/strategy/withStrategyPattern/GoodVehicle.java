package com.example.lld_patterns.strategy.withStrategyPattern;

import com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
