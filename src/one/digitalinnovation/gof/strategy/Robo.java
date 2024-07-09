package com.exemplo.gof.strategy;

public class Robo {

    private Comportamento comportamento;

    public void definirComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void executarMovimento() {
        comportamento.mover();
    }
}
