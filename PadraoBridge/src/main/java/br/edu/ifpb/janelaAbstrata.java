package br.edu.ifpb;

public abstract class janelaAbstrata {
    protected janelaAbstrata janela;

    public janelaAbstrata(janelaAbstrata j) {
        janela = j;
    }

    public void desenhaJanela(String titulo){
        janela.desenhaJanela(titulo);
    }

    public void desenhaBotao(String titulo){
        janela.desenhaBotao(titulo);
    }

    public abstract void desenhar();
}