package org.example;

public class AtendenteNivel1 extends Suporte {
    public AtendenteNivel1(Suporte superior) {
        listaSolicitacoes.add(TipoSolicitacaoSenha.getTipoSolicitacaoSenha());
        this.setSuporteSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendente Nível 1";
    }
}