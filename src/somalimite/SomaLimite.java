package somalimite;

import java.util.Scanner;

public class SomaLimite {

    public static void main(String[] args) {

        int A, N;
        int soma = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();




            for (i = 1; (i * A) <= N; i++) {

                    soma += (A * i);

            }
                    System.out.println(soma);
        }
    }



