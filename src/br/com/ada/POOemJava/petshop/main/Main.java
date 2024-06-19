package br.com.ada.POOemJava.petshop.main;

import br.com.ada.POOemJava.petshop.main.animais.Animal;
import br.com.ada.POOemJava.petshop.main.animais.Cachorro;
import br.com.ada.POOemJava.petshop.main.animais.Gato;
import br.com.ada.POOemJava.petshop.main.animais.Passaro;
import br.com.ada.POOemJava.petshop.main.lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        //criando objetos:
        Cachorro cachorro1  = new Cachorro("Puppy", "marrrom", 30, 2, 5, "nada"); //usando o construtor desenvolvido
        System.out.println(Cachorro.getNumeroDeCachorros());

        //possíveis formas de criar objeto
        Gato gato1 = new Gato("Felix", "preto", 1.2);
        Animal gato2 = new Gato("Felix", "preto", 1.2);

        Passaro passaro1 = new Passaro("Bird", "azul", 0.1);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        cachorro1.soar();
        gato1.soar();
        gato2.soar();
        passaro1.soar();
    }
}
