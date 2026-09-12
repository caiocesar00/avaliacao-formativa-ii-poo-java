import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Curso: ");
        String curso = scan.nextLine();

        System.out.println("--- Dados do estudante ---");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        scan.close();
    }
}