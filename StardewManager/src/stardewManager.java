import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import interfaces.Animal;
import classes.*;

public class stardewManager {

    public static void main(String[] args) {
        List<Animal> curral = new ArrayList<>();

        curral.add(new VacaMae("Mimosa", "Holandesa", 7, 1));
        curral.add(new Bezerro("Mumu", "Holandesa", 1));
        curral.add(new GalinhaMae("Clotilde", "Caipira", 2, 4));
        curral.add(new Pintinho("Fiapo", "Caipira", 0));
        curral.add(new PorcoMae("Bacon", "Hampshire", 3, 2));
        curral.add(new OvelhaMae("Nuvem", "Merino", 4, 5));

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio (coletar/retirar produtos)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verAnimais(curral);
                    break;
                case 2:
                    coletarProdutos(curral);
                    break;
                case 3:
                    System.out.println("Fechando... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }

    private static void verAnimais(List<Animal> curral) {
        System.out.println("\n--- Animais do curral ---");
        for (Animal a : curral) {
            System.out.println("\n" + a.getNome());
            System.out.println("  Raça: " + a.getRaca());
            System.out.println("  Idade: " + a.getIdade() + " ano(s)");
            System.out.println("  Som: " + a.emitirSom());
        }
    }

    private static void coletarProdutos(List<Animal> curral) {
        System.out.println("\n--- Coleta de produtos ---");
        for (Animal a : curral) {
            System.out.println(a.coletarProduto());
        }
    }
}
