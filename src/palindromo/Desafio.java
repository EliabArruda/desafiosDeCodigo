package palindromo;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();


        if(palavra.equalsIgnoreCase(palavraInvertida))
            System.out.println(true);
        else
            System.out.println(false);

    }
}
