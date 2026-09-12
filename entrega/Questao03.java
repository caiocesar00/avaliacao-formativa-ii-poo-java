import java.util.Scanner;

public class Questao03 {

    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.contains("Silva");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        int quantidade = quantidadeCaracteres(nome);
        String nomeMaiusculo = formatarNome(nome);
        boolean temSilva = contemSilva(nome);

        System.out.println("\nQuantidade de caracteres: " + quantidade);
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + temSilva);

        scanner.close();
    }
}