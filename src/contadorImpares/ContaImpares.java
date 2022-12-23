package contadorImpares;

import java.util.Scanner;

public class ContaImpares {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;


        for (int i = 0; i <= tamanhoDaFila; i++) {

            if (i % 2 == 1) {
                pessoasNoCamarote++;
            }
        }
            System.out.println(pessoasNoCamarote);
    }
}
