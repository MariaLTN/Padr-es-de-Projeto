package br.edu.ifpb;

public class janelaDialogo extends janelaAbstrata{

    public janelaDialogo(janelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenhaJanela("Janela de Diálogo :)");
        desenhaBotao("Botão Sim :)");
        desenhaBotao("Botão Não :(");
        desenhaBotao("Botão Cancelar :|");
    }
}