package com.exemplo.gof.singleton;

/**
 * Singleton "ansioso".
 */
public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        // Construtor privado para impedir instanciamento
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
