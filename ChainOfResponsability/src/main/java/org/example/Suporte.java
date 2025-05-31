package org.example;

import java.util.ArrayList;

public abstract class Suporte {
    protected ArrayList<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverSolicitacao(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return this.getDescricaoCargo();
        } else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverSolicitacao(solicitacao);
            } else {
                return "Sem solução disponível";
            }
        }
    }
}