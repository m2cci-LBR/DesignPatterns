package com.capgemini.decorator;

public class Espresso extends Boisson{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 6.5;
    }
}
