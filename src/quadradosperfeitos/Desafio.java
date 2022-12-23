package quadradosperfeitos;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int contador = 0;
        int contadorTotal = 0;
        int verifica;
        int[] d = new int[n + 1];


        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
        for (int i = 0; i < d.length; i++) {

            if (i * i <= n) {
                d[i] = i * i;
            }
        }
        contadorTotal = 1000;

        for (int i = d.length - 1; i >= 0; i--) {
            if(i > 0 && d[i] > 0) {
                verifica = n;
                contador = 0;

                for (int j = i; j > 0; j--) {
                    while (verifica > 0) {

                        if (verifica >= d[j]) {
                            verifica = verifica - d[j];
                            contador++;
                        } else {
                            j--;
                        }
                    }

                }
                if (contadorTotal > contador) {

                    contadorTotal = contador;

                }
            }
        }
        System.out.println(contadorTotal);
    }
}



