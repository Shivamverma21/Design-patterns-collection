package com.example.lld_patterns.strategy.paymentSystem;

public class PaymentProcessorImpl implements PaymentProcessor {
    private PaymentStrategy strategy;
    @Override
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void processPayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        strategy.pay(amount);
    }
}
