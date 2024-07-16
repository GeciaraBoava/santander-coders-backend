package br.com.ada.designpatterns.comportamentais.chainofresponsability.solucao;

import br.com.ada.designpatterns.comportamentais.chainofresponsability.Carro;
import br.com.ada.designpatterns.comportamentais.chainofresponsability.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsability {

    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto =
            new DescontoCarroFIAT(
                new DescontoCarroFORD(
                    new DescontoCarroValorMaiorQueCemMil(
                        new SemDireitoADesconto(null)
                            )));

        return desconto.aplicaDesconto(carro);
    }
}
