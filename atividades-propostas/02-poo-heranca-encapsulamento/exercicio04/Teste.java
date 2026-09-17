package exercicio04;
import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        Character warrior = new Warrior("Ryu", 3, 15, 100, 10);
        Character wizard = new Wizard("Geralt", 5, 20, 80, 30);

        characters.add(warrior);
        characters.add(wizard);

        System.out.println("=========================================");
        System.out.println("   INÍCIO DO DUELO: " + warrior.name + " VS " + wizard.name);
        System.out.println("=========================================\n");

        int round = 1;

        while (warrior.healthPoints > 0 && wizard.healthPoints > 0) {
            System.out.println("--- RODADA " + round + " ---");

            System.out.println("> TURNO DO GUERREIRO:");
            warrior.attack(wizard);

            if (wizard.healthPoints <= 0) {
                System.out.println("\n ☠ " + wizard.name + "foi derrotado!");
                break;
            }



        }

        System.out.println("             FIM DA BATALHA             ");
    }
}

