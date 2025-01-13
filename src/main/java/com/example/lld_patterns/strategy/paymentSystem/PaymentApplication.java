package com.example.lld_patterns.strategy.paymentSystem;

public class PaymentApplication {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessorImpl();

        // Dynamically choose the payment strategy
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100.0);

        processor.setPaymentStrategy(new PayPalPayment());
        processor.processPayment(50.0);

        processor.setPaymentStrategy(new GooglePayPayment());
        processor.processPayment(30.0);
    }
}
