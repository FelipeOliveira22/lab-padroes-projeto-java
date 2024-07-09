package com.exemplo.gof.singleton;

/**
 * Singleton "Lazy Holder".
 */
public class SingletonLazyHolder {

    private static class Holder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        // Construtor privado para impedir instanciamento
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.INSTANCE;
    }
}
