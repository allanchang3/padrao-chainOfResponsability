package org.example;

public class Gerente extends Suporte {
    public Gerente(Suporte superior) {
        listaSolicitacoes.add(TipoSolicitacaoCritica.getTipoSolicitacaoCritica());
        this.setSuporteSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente";
    }
}