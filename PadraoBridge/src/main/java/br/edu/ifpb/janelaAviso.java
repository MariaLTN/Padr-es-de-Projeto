package br.edu.ifpb;

public class janelaAviso extends janelaAbstrata{

    public janelaAviso(janelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenhaJanela("Janela de Aviso :)");
        desenhaBotao("Ok :)");
    }
}