package com.capgemini.strategy;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Payment cash effectue avec success");
    }
}
