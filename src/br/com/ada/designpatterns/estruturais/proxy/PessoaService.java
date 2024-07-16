package br.com.ada.designpatterns.estruturais.proxy;

import br.com.ada.designpatterns.criacionais.builder.main.Pessoa;
import br.com.ada.designpatterns.estruturais.proxy.solucao.ProxyPessoa;

public class PessoaService {

    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) { //CONSTRUTOR - injeção de dependências e inversão de controle
        this.proxyPessoa = proxyPessoa;
    }
    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }
    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }

}
