package buscasequencial;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Busca busca = new Busca();
        Scanner leitor = new Scanner(System.in);


        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int x;
        int i = 0;

        x = leitor.nextInt();

        System.out.println(busca.buscar(elementos, x));

    }
}
    class Busca {

    public String buscar(int[] elementos, int x){

        int i = 0;


        for (i = 0; i < elementos.length; i++) {

            if (elementos[i] == x) {
                return "Achei " + x + " na posicao " + i;
            }
        }
        return "Numero" + x + " nao encontrado";
    }
}

