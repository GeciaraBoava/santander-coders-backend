package br.com.ada.designpatterns.comportamentais.chainofresponsability.solucao;

import br.com.ada.designpatterns.comportamentais.chainofresponsability.Carro;
import br.com.ada.designpatterns.comportamentais.chainofresponsability.Marca;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro{

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
