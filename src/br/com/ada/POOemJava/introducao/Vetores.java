package br.com.ada.POOemJava.introducao;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int k = 0; k < numeros.length; k++) {
            //System.out.println(numeros[k]);
        }

        String[] letras = {"A", "B", "C", "D", "E"};

        for (int l = 0; l < letras.length; l++) {
            //System.out.println(letras[l]);
        }

        //System.out.println(Arrays.toString(letras));

        int[] numerosOrganizar = {9, 10, 12, 25, 2};
        int maior = numerosOrganizar[0];
        int menor = numerosOrganizar[0];
        int media = 0;

        for (int m = 0; m < numerosOrganizar.length; m++) {
            if (numerosOrganizar[m] > maior) {
                maior = numerosOrganizar[m];
            }
            if (numerosOrganizar[m] < menor) {
                menor = numerosOrganizar[m];
            }
            media+= numerosOrganizar[m];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numerosOrganizar.length);
    }
}
