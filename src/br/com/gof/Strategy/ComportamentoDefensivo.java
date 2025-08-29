package br.com.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Se movendo defensivamente!");
    }
}
