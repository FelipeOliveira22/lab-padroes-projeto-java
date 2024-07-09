package com.exemplo.gof.singleton;

/**
 * Singleton "preguiçoso".
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        // Construtor privado para impedir instanciamento
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
