package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoComercialTest {

    @Test
    void deveSolicitarPousoPista() {
        AviaoComercial aviao = new AviaoComercial();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Pista de Aterrissagem autoriza o pouso: Voo JJ3024 solicitando aproximação",
                aviao.solicitarPousoPista("Voo JJ3024 solicitando aproximação"));
    }

    @Test
    void deveSolicitarDecolagemPista() {
        AviaoComercial aviao = new AviaoComercial();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Pista de Aterrissagem confirma a decolagem: Voo G31011 pronto para decolagem",
                aviao.solicitarDecolagemPista("Voo G31011 pronto para decolagem"));
    }

    @Test
    void deveReportarEmergenciaPista() {
        AviaoComercial aviao = new AviaoComercial();
        assertEquals("A Torre de Controle recebeu seu contato.\nA Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Pista de Aterrissagem mobilizou resgate para a emergência: Falha no trem de pouso",
                aviao.reportarEmergenciaPista("Falha no trem de pouso"));
    }

}