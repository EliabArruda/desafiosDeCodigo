package arraypreenchido;

import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int t = leitor.nextInt();

            //TODO: Implemente uma solução para o desafio nos espaços em branco:
            int[] n = new int[t];

            //N[i] = j
            for(int i = 0 ; i < 1000;){
                for(int j = 0;j < t;j++){
                    if(i < 1000 ){
                        System.out.println("N[" + i + "] = "+  j );
                        i++;

                    }
                }
            }
        }
    }

