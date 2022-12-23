package parentesesvalidos;

import java.util.Scanner;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {

        if(!s.equals("()") && !s.equals("[]") && !s.equals("{}") )
            return false;
        else
     return true;
    }

}
