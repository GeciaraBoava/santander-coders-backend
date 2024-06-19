package br.com.ada.designpatterns.Singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY { //

    private static AgendaSingletonLAZY INSTANCE = null;
    //static só aceita 1 instância

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonLAZY() { //construtor
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }
    public static AgendaSingletonLAZY getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
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
