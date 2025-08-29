package br.com.gof.Singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println( lazy);

        System.out.println("==================");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println( eager);

        System.out.println("==================");

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println( holder);
    }
}
