package br.com.ada.POOemJava.introducao;

public class Funcoes {

    public static void main(String[] args) {
        //String nomeOriginal = "Let's Code";
        //saudacao(nomeOriginal);

        int resultado = soma(2, 3);
        System.out.println(resultado);
    }
    //public static void saudacao(String nomeParametro) {
    //System.out.println("Hello, " + nomeParametro);
    public static int soma(int a, int b) {
        return a + b;
    }
}
