package br.com.ada.designpatterns.estruturais.proxy.solucao;

import br.com.ada.designpatterns.criacionais.builder.main.Pessoa;

public interface ProxyPessoa {

    void save(Pessoa pessoa);

    Pessoa findById(Long id);

}
