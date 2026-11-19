import java.util.Scanner;

public class Exercicio204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int opcao;
            double numero1, numero2;

            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair Da Calculadora");
            System.out.println("Digite a operação que deseja realizar: ");
            opcao = sc.nextInt();

            if(opcao == 5){
                System.out.println("Fechando calculadora...");
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            System.out.println("Digite o primeiro número da operação: ");
            numero1 = sc.nextDouble();
            System.out.println("Digite o segundo número da operação: ");
            numero2 = sc.nextDouble();

            switch (opcao){
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, numero1+numero2);
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, numero1-numero2);
                    break;
                case 3:
                    System.out.printf("%.2f x %.2f = %.2f\n", numero1, numero2, numero1*numero2);
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
