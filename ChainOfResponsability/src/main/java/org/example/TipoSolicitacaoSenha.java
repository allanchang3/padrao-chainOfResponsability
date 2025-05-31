package org.example;

public class TipoSolicitacaoSenha implements TipoSolicitacao {
    private static TipoSolicitacaoSenha instance = new TipoSolicitacaoSenha();

    private TipoSolicitacaoSenha() {
    }

    public static TipoSolicitacaoSenha getTipoSolicitacaoSenha() {
        return instance;
    }
}