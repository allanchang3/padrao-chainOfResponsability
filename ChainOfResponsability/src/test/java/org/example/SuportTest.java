package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuporteTest {

    Gerente gerente;
    Supervisor supervisor;
    AtendenteNivel2 atendenteNivel2;
    AtendenteNivel1 atendenteNivel1;

    @BeforeEach
    void setUp() {
        gerente = new Gerente(null);
        supervisor = new Supervisor(gerente);
        atendenteNivel2 = new AtendenteNivel2(supervisor);
        atendenteNivel1 = new AtendenteNivel1(atendenteNivel2);
    }

    @Test
    void deveRetornarAtendenteNivel1ParaSenha() {
        Assertions.assertEquals("Atendente Nível 1",
                atendenteNivel1.resolverSolicitacao(
                        new Solicitacao(TipoSolicitacaoSenha.getTipoSolicitacaoSenha())));
    }

    @Test
    void deveRetornarAtendenteNivel2ParaSoftware() {
        Assertions.assertEquals("Atendente Nível 2",
                atendenteNivel1.resolverSolicitacao(
                        new Solicitacao(TipoSolicitacaoSoftware.getTipoSolicitacaoSoftware())));
    }

    @Test
    void deveRetornarSupervisorParaRede() {
        Assertions.assertEquals("Supervisor",
                atendenteNivel1.resolverSolicitacao(
                        new Solicitacao(TipoSolicitacaoRede.getTipoSolicitacaoRede())));
    }

    @Test
    void deveRetornarGerenteParaCritico() {
        Assertions.assertEquals("Gerente",
                atendenteNivel1.resolverSolicitacao(
                        new Solicitacao(TipoSolicitacaoCritica.getTipoSolicitacaoCritica())));
    }

    @Test
    void deveRetornarSemSolucaoParaSolicitacaoInexistente() {
        // Criando uma solicitação não existente no sistema
        TipoSolicitacao tipoInexistente = new TipoSolicitacao() {};
        Assertions.assertEquals("Sem solução disponível",
                atendenteNivel1.resolverSolicitacao(new Solicitacao(tipoInexistente)));
    }
}
