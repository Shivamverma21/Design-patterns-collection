package com.example.lld_patterns.strategy.advancedPaymentSystem;

public interface PaymentStrategy {
    void register();
    String executeTransaction(double amount);
}
