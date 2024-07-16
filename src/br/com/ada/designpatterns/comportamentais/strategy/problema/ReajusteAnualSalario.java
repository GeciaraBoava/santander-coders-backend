package br.com.ada.designpatterns.comportamentais.strategy.problema;

import java.math.BigDecimal;

import br.com.ada.designpatterns.comportamentais.strategy.Funcionario;
import br.com.ada.designpatterns.comportamentais.strategy.TipoContratacaoEnum;

public class ReajusteAnualSalario {

    public void calculaReajusteAnual(Funcionario funcionario) {
        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));

        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));

        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
