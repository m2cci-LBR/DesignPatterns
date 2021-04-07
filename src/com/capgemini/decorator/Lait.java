package com.capgemini.decorator;

public class Lait extends BoissonDecorateur{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au lait";
    }
}
