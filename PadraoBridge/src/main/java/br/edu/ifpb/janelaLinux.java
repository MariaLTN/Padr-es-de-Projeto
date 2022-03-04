package br.edu.ifpb;

public class janelaLinux implements janelaImplementada{

    @Override
    public void desenhaJanela(String titulo) {
        System.out.printf(titulo + " - janela Linux :)");
    }

    @Override
    public void desenhaBotao(String botao) {
        System.out.printf(botao + " - botão Linux :)");
    }
}