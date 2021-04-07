package com.capgemini.decorator;

public abstract class BoissonDecorateur extends Boisson {

    protected Boisson boisson;

    public BoissonDecorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
