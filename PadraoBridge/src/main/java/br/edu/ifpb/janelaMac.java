package br.edu.ifpb;

public class janelaMac implements janelaImplementada{

    @Override
    public void desenhaJanela(String titulo) {
        System.out.printf(titulo + " - janela Mac :)");
    }

    @Override
    public void desenhaBotao(String botao) {
        System.out.printf(botao + " - botão Mac :)");
    }
}