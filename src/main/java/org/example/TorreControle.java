package org.example;

public class TorreControle {

    private static TorreControle instancia = new TorreControle();

    private TorreControle() {}

    public static TorreControle getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoPousoPista(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + PistaAterrissagem.getInstancia().receberSolicitacaoPouso(mensagem);
    }

    public String receberSolicitacaoDecolagemPista(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + PistaAterrissagem.getInstancia().receberSolicitacaoDecolagem(mensagem);
    }

    public String receberReporteEmergenciaPista(String mensagem) {
        return "A Torre de Controle recebeu seu contato.\n" +
                "A Pista de Aterrissagem respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + PistaAterrissagem.getInstancia().receberReporteEmergencia(mensagem);
    }

}