package com.capgemini.singleton;

public class StaticBlocInitializationSingleton {

    private static StaticBlocInitializationSingleton instance;

    private StaticBlocInitializationSingleton(){
    }

    static {
        try {
           instance = new StaticBlocInitializationSingleton();
         } catch (Exception e){
          e.printStackTrace();
         }
    }

    public static StaticBlocInitializationSingleton getInstance(){
        System.out.println("Static Block init for the class");
        return instance;
    }
}
