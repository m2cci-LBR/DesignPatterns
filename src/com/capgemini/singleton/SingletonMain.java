package com.capgemini.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        /*EagerInitializationSingleton.getInstance();

        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();*/

        /*StaticBlocInitializationSingleton.getInstance();
        StaticBlocInitializationSingleton.getInstance();
        StaticBlocInitializationSingleton.getInstance();*/

        /*StaticBlocInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();*/

        for (int i = 0;i<100;i++){
            //ThreadSafeSingleton.getInstance();
           // ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
            //ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
            ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
        }

    }
}
