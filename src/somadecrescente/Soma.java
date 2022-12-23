package somadecrescente;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        n = input.nextInt();

        System.out.println(somatorio(n));

    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}

