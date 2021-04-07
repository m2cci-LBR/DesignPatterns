package com.capgemini.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("payement credit card effectue avec success");
    }
}
