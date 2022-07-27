package entradaesaida;

import java.util.Scanner;

public class Problem {
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema

        //{"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"};

        String[] nomes = new String[10];



        for (int i = 0; i < 10; i++) {

            System.out.println("Informe a sigla " + (i + 1));
            nomes[i] = sc.nextLine();

        }
            System.out.println("A terceira sigla da lista: " + nomes[2]);
            System.out.println("A setima sigla da lista: " + nomes[6]);
            System.out.println("A nona sigla da lista: " + nomes[8]);

    }
}
