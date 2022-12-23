package fatorialdesajeitado;

import java.util.Scanner;

public class ConsoleApp1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());


        int cnt = 1;

        int mult = n;
        int div = 0;
        int soma = 0;
        int bugSub = 0;


        do {

            for (cnt = n - 1; cnt > 0; cnt--) {

                mult *= cnt;

                if(cnt < 2)
                System.out.println(mult);


                for (cnt = cnt - 1; cnt > 0; cnt--) {
                    div = mult / cnt;


                    if(cnt < 2)
                    System.out.println(div);

                    for (cnt = cnt - 1; cnt > 0; cnt--) {
                        soma = div + (cnt);


                        if(cnt < 2)
                        System.out.println(soma);

                        for (cnt = cnt - 1; cnt > 0; cnt--) {
                            if(cnt < 3){
                                bugSub = soma - cnt;
                            } else
                            bugSub = soma - cnt * (cnt - 1)/(cnt - 2);


                            if(cnt < 3)
                            System.out.println(bugSub);


                                div = bugSub;
                                cnt = cnt - 2;


                                break;
                            }

                        }

                    }

                }


        } while (cnt > 0);
    }
}


