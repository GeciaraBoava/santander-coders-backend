package br.com.ada.designpatterns.builder.problema;

import br.com.ada.designpatterns.builder.main.Pessoa;

import java.time.LocalDate;

public class TestePessoaBuilder {
    public static void main(String[] args) {
        Pessoa pessoa =
                new Pessoa.PessoaBuilder()
                        .nome("Geciara")
                        .sobreNome("Boava")
                        .documento("0123")
                        .email("geciaracardoso@gmail.com")
                        .apelido("Gê")
                        .dataNascimento(LocalDate.of(1987,2,8))
                        .build();

        System.out.println(pessoa);
    }
}
