package com.capgemini.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        PayStrategy strategy = new PayPalPayment();
        strategy.pay();


        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.excexutePayment();




        context.setStrategy(new CreditCardPayment());
        context.excexutePayment();

        context.setStrategy(null);
        context.excexutePayment();

        //context.setStrategy(new CustomPayment());
        //context.excexutePayment();
    }
}
