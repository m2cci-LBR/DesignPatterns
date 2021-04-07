package com.capgemini.observer;

public class ObserverImpl2 implements Observer{
    double lastState;

    @Override
    public void update(int etat) {
      if (etat - lastState >0){
          System.out.println("Observateur 2 => Augmentation de la pression");
      } else if (etat - lastState >0){
          System.out.println("Observateur 2 Depression");
      } else
          System.out.println("Observateur 2 Stabilite");
      lastState = etat;
    }
}
