package com.capgemini.decorator;

public class Deca extends Boisson{

    public Deca() {
        description = "Deca";
    }

    @Override
    public double cout() {
        return 5.2;
    }
}
