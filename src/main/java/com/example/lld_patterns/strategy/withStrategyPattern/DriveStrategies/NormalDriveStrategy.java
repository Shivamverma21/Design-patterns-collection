package com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}
