package filtraFormatoArquivo;

import java.util.Scanner;

public class Filtro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String arquivoDoPc = leitor.next();
        boolean formatoMp3 = arquivoDoPc.endsWith(".mp3");

       if(formatoMp3 == true){
           System.out.println("Salvar");
       } else {
           System.out.println("Deletar");
       }
    }
}
