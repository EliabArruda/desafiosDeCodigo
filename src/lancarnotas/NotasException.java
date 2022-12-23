package lancarnotas;

public class NotasException extends Exception{

    public void mensagem() throws Throwable {
        System.out.println("As notas precisam estar entre 0,0 e 10,0");

    }
}
