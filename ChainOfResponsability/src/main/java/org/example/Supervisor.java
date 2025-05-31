package org.example;

public class Supervisor extends Suporte {
    public Supervisor(Suporte superior) {
        listaSolicitacoes.add(TipoSolicitacaoRede.getTipoSolicitacaoRede());
        this.setSuporteSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Supervisor";
    }
}