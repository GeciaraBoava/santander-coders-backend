package br.com.ada.designpatterns.comportamentais.chainofresponsability.solucao;

import br.com.ada.designpatterns.comportamentais.chainofresponsability.Carro;

import java.math.BigDecimal;

public abstract class DescontoCarro {

    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
