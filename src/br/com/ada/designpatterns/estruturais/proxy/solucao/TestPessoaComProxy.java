package br.com.ada.designpatterns.estruturais.proxy.solucao;

import br.com.ada.designpatterns.criacionais.builder.main.Pessoa;
import br.com.ada.designpatterns.estruturais.proxy.PessoaService;

import java.time.LocalDate;

public class TestPessoaComProxy {
    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();

        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy); //injeção de dependência
        // posso passar tanto o pessoaRepositoryProxy quanto o novoPessoaRepositoryProxy na linha acima,
        //pois ambos implementam a interface ProxyPessoa
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Boava")
                .dataNascimento(LocalDate.of(1987,2,8))
                .nome("Geciara")
                .apelido("Gê")
                .documento("123456")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
