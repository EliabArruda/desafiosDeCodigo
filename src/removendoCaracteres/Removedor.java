package removendoCaracteres;

import java.util.Scanner;

public class Removedor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase =  leitor.next();
        String array[] = frase.split("/");

        System.out.println("Imovel:\n" + array[0] + " R$" + array[1] +
                    "\n" + array[2]);
        }
    }

