package com.capgemini.strategy;

public class PayPalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("payement paypal effectue avec success");
    }
}
