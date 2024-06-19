package br.com.ada.POOemJava.petshop.main.lojas;

import br.com.ada.POOemJava.petshop.main.animais.Animal;
import br.com.ada.POOemJava.petshop.main.animais.Cachorro;

public class Petshop {
    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("limpo");
    }
    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("tosado");
    }
    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }
}