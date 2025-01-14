package com.example.lld_patterns.strategy.advancedPaymentSystem;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class GooglePayPayment implements PaymentStrategy {
    @PostConstruct
    @Override
    public void register() {
        PaymentProcessorImlp.addPaymentStrategy(PaymentMode.GooglePay, this);
    }

    @Override
    public String executeTransaction(double amount) {
        return "Amount paid via Google Pay: " + amount;
    }
}
