package org.example;

public class PistaAterrissagem implements EquipeSolo {

    private static PistaAterrissagem instancia = new PistaAterrissagem();

    private PistaAterrissagem() {}

    public static PistaAterrissagem getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoPouso(String mensagem) {
        return "A Pista de Aterrissagem autoriza o pouso: " + mensagem;
    }

    public String receberSolicitacaoDecolagem(String mensagem) {
        return "A Pista de Aterrissagem confirma a decolagem: " + mensagem;
    }

    public String receberReporteEmergencia(String mensagem) {
        return "A Pista de Aterrissagem mobilizou resgate para a emergência: " + mensagem;
    }
}