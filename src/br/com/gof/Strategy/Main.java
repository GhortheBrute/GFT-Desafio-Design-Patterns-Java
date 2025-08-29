package br.com.gof.Strategy;

public class Main {
    public static void main(String[] args) {
        Comportamento desenfivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(desenfivo);
        robo.mover();
        robo.mover();
    }
}
