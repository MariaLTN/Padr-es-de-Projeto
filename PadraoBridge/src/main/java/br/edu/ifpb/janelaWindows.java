package br.edu.ifpb;

public class janelaWindows implements janelaImplementada {
    @Override
    public void desenhaJanela(String titulo) {
        System.out.printf(titulo + " - janela Windows :)");
    }

    @Override
    public void desenhaBotao(String botao) {
        System.out.printf(botao + " - botão Windows :)");
    }
}