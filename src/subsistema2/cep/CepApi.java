package com.exemplo.subsistema2.cep;

public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi() {
        // Construtor privado para impedir instanciamento
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        // Simulação de lógica para buscar a cidade a partir do CEP
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        // Simulação de lógica para buscar o estado a partir do CEP
        return "SP";
    }
}
