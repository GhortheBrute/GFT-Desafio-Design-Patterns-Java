package br.com.gof.Singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 *
 * @author Ghor_the_Brute
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {

    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
