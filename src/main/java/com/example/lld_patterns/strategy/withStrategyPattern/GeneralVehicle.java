package com.example.lld_patterns.strategy.withStrategyPattern;

import com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies.NormalDriveStrategy;

public class GeneralVehicle extends Vehicle {

    public GeneralVehicle() {
        super(new NormalDriveStrategy());
    }

}
