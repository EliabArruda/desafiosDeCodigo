package reduzir;
import java.util.*;

public class ReduzirAZero {
    public static void main(String[] args) {

        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:


        while (num > 0) {

            //Se 'num' for par, dividi-se 'num' por 2
            if ((num % 2) == 0) {
                num /= 2;
               // System.out.println(num);
            } else {
                //Se 'num' for ímpar, subtrai-se 'num' por 1
                num -= 1;
             //   System.out.println(num);
            }

            step++;
        }

        System.out.println(step);


    }
}
