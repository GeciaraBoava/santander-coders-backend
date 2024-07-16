package br.com.ada.designpatterns.comportamentais.chainofresponsability.solucao;

import br.com.ada.designpatterns.comportamentais.chainofresponsability.Carro;
import br.com.ada.designpatterns.comportamentais.chainofresponsability.Marca;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro{

    public SemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
