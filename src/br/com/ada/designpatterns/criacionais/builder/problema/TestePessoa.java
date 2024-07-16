package br.com.ada.designpatterns.criacionais.builder.problema;

import br.com.ada.designpatterns.criacionais.builder.main.Pessoa;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Geciara",
                "Boava",
                "0123",
                "geciaracardoso@gmail.com",
                "Gê",
                LocalDate.of(1987,02,8));
    }
}
