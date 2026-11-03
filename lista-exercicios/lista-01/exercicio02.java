import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        Integer numero2 = sc.nextInt();
        System.out.println("Os números digitados foram: " + numero1 + " | " + numero2);

        sc.close();
    }
}
