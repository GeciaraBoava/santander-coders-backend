package br.com.ada.designpatterns.criacionais.factoryMethod.solucao;

import br.com.ada.designpatterns.criacionais.factoryMethod.Produto;
import br.com.ada.designpatterns.criacionais.factoryMethod.ProdutoDigital;
import br.com.ada.designpatterns.criacionais.factoryMethod.ProdutoFisico;
import br.com.ada.designpatterns.criacionais.factoryMethod.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }
}
