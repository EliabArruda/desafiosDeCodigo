package fizzbuzzmultiplo;

import java.util.Scanner;

public class VerificaMultiplo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(num%5 == 0 & num%3 == 0  ) {

            System.out.println("FizzBuzz");
        }
       else if(num%3 == 0){

            System.out.println("Fizz");

        }
        else if(num%5 == 0){

            System.out.println("Buzz");

        } else {
            System.out.println(num);
        }



        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
}
