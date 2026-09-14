import classes.Picareta;

public class oldStevePOO {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║ VELHO STEVE - FÁBRICA DE PICARETAS (ORIENTADA A OBJETOS) ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta p1 = new Picareta("madeira", 50, 5);
        Picareta p2 = new Picareta("pedra", 70, 8);
        Picareta p3 = new Picareta("ferro", 100, 12);
        Picareta p4 = new Picareta("diamante", 150, 20);
        Picareta p5 = new Picareta("netherite", 200, 25);

        System.out.println("\nPicaretas fabricadas:");
        System.out.println("  • " + p1);
        System.out.println("  • " + p2);
        System.out.println("  • " + p3);
        System.out.println("  • " + p4);
        System.out.println("  • " + p5);

        System.out.println("\n  Usando picaretas para minerar...");
        p3.minerar(30);
        p3.minerar(20);

        System.out.println("\n Criando picareta de ouro...");
        Picareta p6 = new Picareta("ouro", 30, 15);

        System.out.println("\n Reparando a picareta de ferro...");
        p3.repararPicareta(50);

        System.out.println("\nEstado final das picaretas:");
        System.out.println("  • " + p1);
        System.out.println("  • " + p2);
        System.out.println("  • " + p3);
        System.out.println("  • " + p4);
        System.out.println("  • " + p5);
        System.out.println("  • " + p6);
    }
}
