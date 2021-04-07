package com.capgemini.strategy;

public class CustomPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Payment personalise effectue avec Success");
    }
}
