package br.com.ada.designpatterns.criacionais.singleton.problema;

public class TesteAgenda {
    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sábado");

    }
    public static void reservaDia(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    } //toda vez que chamar o reservaDia vai criar uma nova agenda e não é o que queremos
}
