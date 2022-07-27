package mediaponderada;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos casos: ");
        int casos = input.nextInt();


        int cont = 0;
        double media = 0;


        while (cont < casos) {

            System.out.println("Informe sua nota");
            double a = input.nextDouble();

            System.out.println("Informe sua nota");
            double b = input.nextDouble();

            System.out.println("Informe sua nota");
            double c = input.nextDouble();

            // TODO: complete os espaços em branco com sua solução para o problema

            media = ((a * 2) + (b * 3) + (c * 5))/ 10;

            System.out.printf("%.1f %n", media);

            cont++;
        }
    }
}
