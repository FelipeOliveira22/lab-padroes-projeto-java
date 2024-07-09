package com.exemplo.subsistema1.crm;

public class CrmService {

    private CrmService() {
        // Construtor privado para impedir instanciamento
    }

    public static void salvarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
