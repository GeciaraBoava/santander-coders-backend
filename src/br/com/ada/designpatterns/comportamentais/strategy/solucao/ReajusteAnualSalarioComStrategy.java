package br.com.ada.designpatterns.comportamentais.strategy.solucao;

import br.com.ada.designpatterns.comportamentais.strategy.Funcionario;
import br.com.ada.designpatterns.comportamentais.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
        calculador.calcularReajusteAnual(funcionario);
    }
}
