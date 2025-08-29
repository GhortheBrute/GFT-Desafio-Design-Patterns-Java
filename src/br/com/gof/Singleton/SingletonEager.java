package br.com.gof.Singleton;

/**
 * Singleton "Apressado"
 *
 * @author Ghor_the_Brute
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
