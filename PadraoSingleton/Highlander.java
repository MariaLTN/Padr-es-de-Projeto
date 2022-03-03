package br.edu.ifpb;

public class Highlander {
    private Highlander(){}
    private static Highlander instancia;
    private static int contador = 0; // Parte 02:

    public static Highlander obterInstancia(){
        contador++; // Parte 02:
        if (instancia==null){
            instancia = new Highlander();
        } return instancia;
    }

    // Parte 02:
    public String gerarRelatorio(){
        return new String("O número de vezes que o método 'obterInstancia' foi chamado foi: " + contador);
    }
    // Fim da Parte 02:
}
