import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean varControle = false;

        while (!varControle){
            int opcao;

            System.out.println("=== FILAS PRIORITÁRIAS ===");
            System.out.println("1 - Gestante");
            System.out.println("2 - Idosa");
            System.out.println("3 - PCD");
            System.out.println("4 - Nenhuma das alternativas");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                case 2:
                case 3:
                    System.out.println("Você tem direito 'a fila prioritária.");
                    varControle = true;
                    break;
                case 4:
                    System.out.println("Você não tem direito à fila prioritária.");
                    varControle = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
