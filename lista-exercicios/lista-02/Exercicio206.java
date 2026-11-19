import java.util.Scanner;

public class Exercicio206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Inversor de Strings =====");

        System.out.println("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();

        for (int i = texto.length(); i > 0; i--) {
            System.out.print(texto.charAt(i-1));
        }

        sc.close();
    }
}
