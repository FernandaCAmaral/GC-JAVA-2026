import java.util.Scanner;

public class Exercicio207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Jogo Adivinhação =====");
        int inimigos = 300000;
        int palpite = 0;

        while(palpite != inimigos){
            System.out.println("\nAdivinhe quantos soldados os 300 espartanos irão enfrentar:");

            if (sc.hasNextInt()) {
                palpite = sc.nextInt();

                if (palpite > inimigos) {
                    System.out.println("Leônidas: Um pouco menos!");
                } else if (palpite < inimigos) {
                    System.out.println("Leônidas: Um pouco mais!");
                } else {
                    System.out.println("Leônidas: Exato! Prepare-se para a batalha!");
                }

            } else {
                System.out.println("Leônidas: Isso não é um número inteiro! Digite apenas Inteiros.");
                sc.next();
            }
        }
        sc.close();
    }
}
