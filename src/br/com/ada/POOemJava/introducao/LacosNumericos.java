package br.com.ada.POOemJava.introducao;

public class LacosNumericos {
    public static void main(String[] args) {

        //para uma variável que inicia em 1 e vai até 10, mudando 1 por 1, faça:
        for (int i = 1; i <= 10; i++ ) { //para variar de dois em dois, por exemplo: i+=2
            System.out.println(i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }
    }
}
