package com.exemplo.gof.facade;

import com.exemplo.subsistema1.crm.CrmService;
import com.exemplo.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.salvarCliente(nome, cep, cidade, estado);
    }
}
