package com.example.lld_patterns.strategy.paymentSystem;

public interface PaymentProcessor {
    void setPaymentStrategy(PaymentStrategy strategy);
    void processPayment(double amount);
}
