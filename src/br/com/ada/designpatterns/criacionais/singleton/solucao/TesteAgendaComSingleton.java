package br.com.ada.designpatterns.criacionais.singleton.solucao;

import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();

        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");*/

        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        //código chamado reflection, que torna o construtor público. PERIGO!!
        /*Constructor<AgendaSingletonEnum> construtorTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);

        AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();
        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());*/

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sábado");

//      Teste para ver se ainda é possível criar uma nova instância
//        System.out.println(new AgendaSingletonEAGER());
//        System.out.println(new AgendaSingletonEAGER());

    }
    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        //Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        //Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        //Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
