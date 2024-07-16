package br.com.ada.designpatterns.comportamentais.templatemethod.solucao;

import br.com.ada.designpatterns.comportamentais.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    @Override
    protected void entradaOficina() {
        System.out.println("Entrando na oficina, meu carro é simples mas está quitado");}

}
