package org.example;

public class TipoSolicitacaoCritica implements TipoSolicitacao {
    private static TipoSolicitacaoCritica instance = new TipoSolicitacaoCritica();

    private TipoSolicitacaoCritica() {
    }

    public static TipoSolicitacaoCritica getTipoSolicitacaoCritica() {
        return instance;
    }
}
