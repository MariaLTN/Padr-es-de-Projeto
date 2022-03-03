package br.edu.ifpb;

import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {

        // Parte 01:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas vezes deseja solicitar instâncias de Highlander: ");
        int numeroSolicitacao = scanner.nextInt();

        Highlander[] highlanders = new Highlander[numeroSolicitacao];
        for (int i = 0; i <numeroSolicitacao; i++){
            highlanders[i] = Highlander.obterInstancia();
        }
        // Fim da Parte 01:

        // Parte 03:
        if (numeroSolicitacao > 0) {
            System.out.println(highlanders[numeroSolicitacao-1].gerarRelatorio());
        } else {
            System.out.printf("Nada foi solicitado.");
        }
        // Fim da Parte 03:
    }
}
