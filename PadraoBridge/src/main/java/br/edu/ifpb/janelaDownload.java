package br.edu.ifpb;

import java.util.Scanner;

public class janelaDownload extends janelaAbstrata {

    public janelaDownload(janelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenhaJanela("Janela de Download :)");
        String respostaUsuario;

        desenhaJanela("Download :)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Onde o Download deve ser feito? ");
        respostaUsuario = scanner.nextLine();

        desenhaBotao("Relizar Download :)");
        desenhaBotao("Cancelar Download");
    }
}