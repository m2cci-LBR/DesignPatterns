package com.capgemini.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
    }

    public static synchronized ThreadSafeSingleton getInstance(){
      if (instance == null){
          instance = new ThreadSafeSingleton();
          System.out.println("Thread safe new instance");
          return instance;
      }
        System.out.println(" Returning Thread safe new instance");
      return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckThreadSafeInstance(){
        if (instance == null){
            synchronized (ThreadSafeSingleton.class){
                if (instance == null){
                    instance = new ThreadSafeSingleton();
                    System.out.println("Thread safe double check new instance");
                }
            }
            return instance;
        }
        //System.out.println(" Returning Thread safe double check instance");
        return instance;
    }
}
