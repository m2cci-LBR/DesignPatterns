package com.capgemini.strategy;

public class PaymentContext {

    private PayStrategy strategy;

    public PaymentContext(PayStrategy strategy) {
        this.strategy = strategy;
    }

    void excexutePayment(){
        if (strategy == null){
            System.out.println("Aucun moyen de payment n a ete defini");
            return;
        }
        strategy.pay();
    }

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }
}
