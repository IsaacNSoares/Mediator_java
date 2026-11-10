package org.example;

public class Aeronave {

    public String solicitarPousoPista(String mensagem) {
        return TorreControle.getInstancia().receberSolicitacaoPousoPista(mensagem);
    }

    public String solicitarDecolagemPista(String mensagem) {
        return TorreControle.getInstancia().receberSolicitacaoDecolagemPista(mensagem);
    }

    public String reportarEmergenciaPista(String mensagem) {
        return TorreControle.getInstancia().receberReporteEmergenciaPista(mensagem);
    }

}