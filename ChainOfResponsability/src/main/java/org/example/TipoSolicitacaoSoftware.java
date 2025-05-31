package org.example;

public class TipoSolicitacaoSoftware implements TipoSolicitacao {
    private static TipoSolicitacaoSoftware instance = new TipoSolicitacaoSoftware();

    private TipoSolicitacaoSoftware() {
    }

    public static TipoSolicitacaoSoftware getTipoSolicitacaoSoftware() {
        return instance;
    }
}