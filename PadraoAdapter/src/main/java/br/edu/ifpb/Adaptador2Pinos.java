package br.edu.ifpb;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class Adaptador2Pinos extends ServicoTomada3Pinos implements Interface_Alvo {
    Adaptador2Pinos(Fio pinoFase, Fio pinoNeutro){
        super(pinoFase, pinoNeutro, pinoNeutro);
    }

    @Override
    public void forneceEnergia(){
        super.forneceEnergia();
    }
}
