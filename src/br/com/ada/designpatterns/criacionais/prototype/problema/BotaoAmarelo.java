package br.com.ada.designpatterns.criacionais.prototype.problema;

import br.com.ada.designpatterns.criacionais.prototype.Botao;
import br.com.ada.designpatterns.criacionais.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
