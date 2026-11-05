import java.util.Scanner;

public class exercicio201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o início do intervalo: ");
        int inicio = sc.nextInt();

        System.out.println("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        if (inicio > fim) {
            System.out.println("O início não pode ser maior que o fim.");
        } else {
            System.out.println("Números primos entre " + inicio + " e " + fim + ":");
            for (int numero = inicio; numero <= fim; numero++) {
                if (ehPrimo(numero)) {
                    System.out.println(numero);
                }
            }
        }

        sc.close();
    }

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
