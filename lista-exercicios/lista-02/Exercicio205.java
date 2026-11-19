import java.util.Scanner;

public class Exercicio205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        int meio = texto.length() / 2;
        String primeiraMetade = texto.substring(0, meio);

        System.out.println("Primeira metade: " + primeiraMetade);

        sc.close();
    }
}
