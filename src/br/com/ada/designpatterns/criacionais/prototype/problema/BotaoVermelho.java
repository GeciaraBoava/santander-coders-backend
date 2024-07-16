package br.com.ada.designpatterns.criacionais.prototype.problema;

import br.com.ada.designpatterns.criacionais.prototype.Botao;
import br.com.ada.designpatterns.criacionais.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
