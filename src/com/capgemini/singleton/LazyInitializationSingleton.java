package com.capgemini.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){

    }

    public static LazyInitializationSingleton getInstance(){
      if (instance == null){
          System.out.println("Creating new Instance of the class Lazy");
          instance = new LazyInitializationSingleton();
          return instance;
      }
        System.out.println("Returning the Instance of the class Lazy");
      return instance;
    }
}
