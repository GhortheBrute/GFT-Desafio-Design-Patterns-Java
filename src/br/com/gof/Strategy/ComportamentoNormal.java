package br.com.gof.Strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Se movendo");
    }
}
