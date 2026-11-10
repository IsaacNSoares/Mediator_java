package org.example;

public interface EquipeSolo {
    String receberSolicitacaoPouso(String mensagem);
    String receberSolicitacaoDecolagem(String mensagem);
    String receberReporteEmergencia(String mensagem);
}