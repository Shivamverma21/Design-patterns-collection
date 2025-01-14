package com.example.lld_patterns.strategy.advancedPaymentSystem;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentProcessorImlp implements PaymentProcessor {
    private static final Map<PaymentMode, PaymentStrategy> paymentStrategyMap = new HashMap<>();

    // Allows strategies to register themselves
    public static void addPaymentStrategy(PaymentMode paymentMode, PaymentStrategy paymentStrategy) {
        paymentStrategyMap.put(paymentMode, paymentStrategy);
    }

    @Override
    public String processPayment(PaymentMode paymentMode, double amount) {
        PaymentStrategy strategy = paymentStrategyMap.get(paymentMode);
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for payment mode: " + paymentMode);
        }
        return strategy.executeTransaction(amount);
    }
}
