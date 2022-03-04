package br.edu.ifpb;

public class janelaAndroid implements janelaImplementada {
    @Override
    public void desenhaJanela(String titulo) {
        System.out.printf(titulo + " - janela Android :)");
    }

    @Override
    public void desenhaBotao(String botao) {
        System.out.printf(botao + " - botão Android :)");
    }
}