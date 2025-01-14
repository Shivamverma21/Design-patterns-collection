package com.example.lld_patterns.strategy.advancedPaymentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PaymentApplication.class, args);

        PaymentProcessorImlp paymentProcessorImlp = context.getBean(PaymentProcessorImlp.class);
        System.out.println(paymentProcessorImlp.processPayment(PaymentMode.PayPal, 100.0));
        System.out.println(paymentProcessorImlp.processPayment(PaymentMode.CreditCard, 200.0));
        System.out.println(paymentProcessorImlp.processPayment(PaymentMode.GooglePay, 300.0));
    }
}
