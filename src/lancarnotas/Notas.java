package lancarnotas;

import java.util.Scanner;

public class Notas {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int qtAlunos;
            double nota = 0;
            double soma = 0;
            double media = 0;

            System.out.println("Informe a quantidade de alunos de sua turma:");
            qtAlunos = sc.nextInt();

            int[] array = new int[qtAlunos];

                for (int i = 0; i < array.length; i++) {

                    System.out.println("Informe a nota do Aluno " + (i + 1));
                    nota = sc.nextDouble();

                    if (nota < 0 || nota > 10) {
                        NotasException exception = new NotasException();
                        try {
                            exception.mensagem();
                        } catch (Throwable e) {
                            e.printStackTrace();
                        }
                        break;

                    } else {

                        soma += nota;

                        media = soma / qtAlunos;

                    }
                }

                    System.out.println("A média final da turma é: " + media);

        }

}
