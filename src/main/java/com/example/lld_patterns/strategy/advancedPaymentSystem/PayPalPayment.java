package com.example.lld_patterns.strategy.advancedPaymentSystem;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements PaymentStrategy {
    @PostConstruct
    @Override
    public void register() {
        PaymentProcessorImlp.addPaymentStrategy(PaymentMode.PayPal, this);
    }

    @Override
    public String executeTransaction(double amount) {
        return "Amount paid via Pay Pal: " + amount;
    }
}
