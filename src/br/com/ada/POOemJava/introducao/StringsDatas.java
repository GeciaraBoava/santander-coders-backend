package br.com.ada.POOemJava.introducao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nome = "Geciara";
        System.out.println(nome.toUpperCase()); //converte para letras maiúsculas
        System.out.println(nome.toLowerCase()); //converte para letras minúsculas
        System.out.println(nome.length()); //informa quantidade de letras

        LocalDate hoje = LocalDate.now();
        //Locale brasil = new Locale("pt", "BR"); depreciado na versão 19 do Java
        Locale brasil = Locale.of("pt","BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);

        String saudacao = "";
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, dia %s, %s.%n", nome, diaSemana, hoje.getDayOfMonth(), saudacao.toUpperCase());
    }
}