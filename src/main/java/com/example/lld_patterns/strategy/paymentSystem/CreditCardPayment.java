package com.example.lld_patterns.strategy.paymentSystem;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(Double amount){
        System.out.println("Processing credit card payment of $: " + amount);
    }
}
