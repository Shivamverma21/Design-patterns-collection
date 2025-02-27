package com.example.lld_patterns.strategy.withStrategyPattern.DriveStrategies;

public class SportDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("SportDriveStrategy");
    }
}
