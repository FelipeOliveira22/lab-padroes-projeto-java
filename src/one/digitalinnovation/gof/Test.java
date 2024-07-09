package com.exemplo.gof;

import com.exemplo.gof.facade.Facade;
import com.exemplo.gof.singleton.SingletonEager;
import com.exemplo.gof.singleton.SingletonLazy;
import com.exemplo.gof.singleton.SingletonLazyHolder;
import com.exemplo.gof.strategy.Comportamento;
import com.exemplo.gof.strategy.ComportamentoAgressivo;
import com.exemplo.gof.strategy.ComportamentoDefensivo;
import com.exemplo.gof.strategy.ComportamentoNormal;
import com.exemplo.gof.strategy.Robo;

public class Main {

    public static void main(String[] args) {

        // Teste Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Teste Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.definirComportamento(normal);
        robo.executarMovimento();
        robo.executarMovimento();
        robo.definirComportamento(defensivo);
        robo.executarMovimento();
        robo.definirComportamento(agressivo);
        robo.executarMovimento();
        robo.executarMovimento();
        robo.executarMovimento();

        // Teste Facade
        Facade facade = new Facade();
        facade.migrarCliente("Carlos", "14801788");
    }
}
