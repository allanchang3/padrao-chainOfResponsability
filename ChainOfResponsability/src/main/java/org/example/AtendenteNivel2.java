package org.example;

public class AtendenteNivel2 extends Suporte {
    public AtendenteNivel2(Suporte superior) {
        listaSolicitacoes.add(TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware());
        this.setSuporteSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendente Nível 2";
    }
}
