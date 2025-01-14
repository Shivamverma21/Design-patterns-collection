package com.example.lld_patterns.strategy.advancedPaymentSystem;

public interface PaymentProcessor {
    String processPayment(PaymentMode paymentMode, double amount);
}
