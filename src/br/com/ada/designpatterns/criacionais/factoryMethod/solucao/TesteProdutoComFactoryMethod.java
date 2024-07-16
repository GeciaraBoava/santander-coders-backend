package br.com.ada.designpatterns.criacionais.factoryMethod.solucao;

import br.com.ada.designpatterns.criacionais.factoryMethod.Produto;
import br.com.ada.designpatterns.criacionais.factoryMethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

        //Calendar instance = Calendar.getInstance(); exemplo de factory do Java
    }
}
