import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int qntalu = scan.nextInt();

        double soma = 0;
        double MaiorNota = 0;
        double MenorNota = 10;
        int aprovados = 0;



       for ( int n = 1; n <= qntalu; n++) {
            System.out.print("Nota do estudante " + n +" : ");
            double nota = scan.nextDouble();

            soma = soma + nota;

            if (nota > MaiorNota) {
                MaiorNota = nota;
            }
            if (nota < MenorNota) {
                MenorNota = nota;
            }
            if (nota >= 7.0) {
                aprovados++;
            }
       }
       double media = soma / qntalu;
       System.out.println("--- Resultado ---");
       System.out.println("Média da turma: " + media);
       System.out.println("Maior Nota: " + MaiorNota);
       System.out.println("Menor Nota: " + MenorNota);
       System.out.println("Estudantes Aprovados: " + aprovados);

       scan.close();
    }
}
