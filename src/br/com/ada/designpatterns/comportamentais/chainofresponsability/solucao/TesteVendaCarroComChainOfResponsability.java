
package br.com.ada.designpatterns.comportamentais.chainofresponsability.solucao;

import br.com.ada.designpatterns.comportamentais.chainofresponsability.Carro;
import br.com.ada.designpatterns.comportamentais.chainofresponsability.Marca;
import br.com.ada.designpatterns.comportamentais.chainofresponsability.problema.VendaCarroService;

import java.math.BigDecimal;

public class TesteVendaCarroComChainOfResponsability {
    public static void main(String[] args) {
        VendaCarroServiceComChainOfResponsability vendaCarroService = new VendaCarroServiceComChainOfResponsability();

        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(90000.00));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor de venda Fusion: " + carro1.getPreco());
        System.out.println("Valor de venda Fusion com desconto: " + valorVenda1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40000.00));

        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor de venda Uno: " + carro2.getPreco());
        System.out.println("Valor de venda Uno com desconto: " + valorVenda2);

        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(200000.00));

        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor de venda Camaro: " + carro3.getPreco());
        System.out.println("Valor de venda Camaro com desconto: " + valorVenda3);

        Carro carro4 = new Carro();
        carro4.setMarca(Marca.CHEVROLET);
        carro4.setModelo("Usado");
        carro4.setPreco(new BigDecimal(50000.00));

        BigDecimal valorVenda4 = vendaCarroService.calculaValorVenda(carro4);
        System.out.println("Valor de venda Usado: " + carro4.getPreco());
        System.out.println("Valor de venda Usado com desconto: " + valorVenda4);
    }
}
