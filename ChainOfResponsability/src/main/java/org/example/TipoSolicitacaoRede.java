package org.example;

public class TipoSolicitacaoRede implements TipoSolicitacao {
    private static TipoSolicitacaoRede instance = new TipoSolicitacaoRede();

    private TipoSolicitacaoRede() {
    }

    public static TipoSolicitacaoRede getTipoSolicitacaoRede() {
        return instance;
    }
}