package br.com.ada.designpatterns.estruturais.proxy.solucao;

import br.com.ada.designpatterns.criacionais.builder.main.Pessoa;
import br.com.ada.designpatterns.estruturais.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.Map;

public class PessoaRepositoryProxy extends PessoaRepository  implements ProxyPessoa {

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save... ");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada. ");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo findByid... ");
        long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))) {
            log.info("Está pegando do cache. ");
            pessoa = cache.get(id);
        } else {
            log.info("Está pegando do Pessoa Repository. ");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Chamada do metodo findById finalizada. ");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada... " + (fim - inicio));
        return pessoa;
    }
}
