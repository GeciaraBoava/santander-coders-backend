package br.com.ada.designpatterns.comportamentais.templatemethod.solucao;

import br.com.ada.designpatterns.comportamentais.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoLuxoServiceComTemplateMethod extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
