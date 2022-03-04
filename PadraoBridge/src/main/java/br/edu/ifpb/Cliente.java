package br.edu.ifpb;

public class Cliente
{
    public static void main( String[] args ) {
        janelaAbstrata janela = new janelaDialogo(new janelaLinux());
        janela.desenhar();

        janela = new janelaAviso(new janelaLinux());
        janela.desenhar();

        janela = new janelaDialogo(new janelaWindows());
        janela.desenhar();

        janela = new janelaDownload(new janelaAndroid());
        janela.desenhar();

    }
}