package br.com.ada.designpatterns.criacionais.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

//ESTA É A FORMA RECOMENDADA! ERA USADO O JAVA SECURIY, MAS FOI DEPRECIADO A PARTIR DA VERSÃO 13
public enum AgendaSingletonEnum { //

    INSTANCE;
    //static só aceita 1 instância

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEnum() { //construtor
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }
    public static AgendaSingletonEnum getInstance() {
        return INSTANCE;
        //com o INSTANCE,o método vai trabalhar na mesma instância (espaço na memória)
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }
    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }

}
