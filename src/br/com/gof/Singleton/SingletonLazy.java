package br.com.gof.Singleton;

/**
 * Singleton "Preguiçoso"
 *
 * @author Ghor_the_Brute
 */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
