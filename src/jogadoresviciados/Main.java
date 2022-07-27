package jogadoresviciados;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number,id;

        System.out.println("Informe o numero de gameplays publicados na pagina");
        number=sc.nextInt();

        System.out.println("Informe o identificador na pagina");
        id=sc.nextInt();

        int count=0;
        while(number>0 && number <= 104){

            int id1,num;

            System.out.println("Informe o Identificador do Autor");
            id1=sc.nextInt();

            System.out.println("Informe o codigo do jogo");
            num=sc.nextInt();

// TODO: complete os espaços em branco com sua solução para o problema
            if(id1 >= 1000 &&  num == 0 && id == id1){
                count++;
            }

            number--;
        }
        System.out.println(count);

    }
}
