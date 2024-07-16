package br.com.ada.designpatterns.criacionais.prototype.problema;

import br.com.ada.designpatterns.criacionais.prototype.Botao;
import br.com.ada.designpatterns.criacionais.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
