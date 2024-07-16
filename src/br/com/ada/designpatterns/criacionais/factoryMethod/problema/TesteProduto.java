package br.com.ada.designpatterns.criacionais.factoryMethod.problema;

import br.com.ada.designpatterns.criacionais.factoryMethod.ProdutoDigital;
import br.com.ada.designpatterns.criacionais.factoryMethod.ProdutoFisico;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
