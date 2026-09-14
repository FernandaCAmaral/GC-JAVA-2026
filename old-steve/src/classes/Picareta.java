package classes;

public class Picareta {
    private String material;
    private int durabilidade;
    private int forca;

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;

        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + this.material);
        System.out.println("Durabilidade: " + this.durabilidade);
        System.out.println("Força: " + this.forca);

        if (durabilidade <= 0 || forca <= 0) {
            System.out.println(" Picareta inválida!");
        } else {
            System.out.println("Picareta de " + material + " fabricada com sucesso!");
        }
    }

    public void minerar(int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return;
        }

        int blocosMinerados = 0;

        for (int i = 0; i < blocos; i++) {
            if (durabilidade <= 0) {
                System.out.println(" Picareta quebrou no bloco " + (i + 1));
                break;
            }
            durabilidade--;
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + durabilidade);

        if (durabilidade <= 0) {
            System.out.println(" A picareta de " + material + " quebrou completamente!");
        }
    }

    public void repararPicareta(int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int limiteMaximo = 0;

        switch (material.toLowerCase()) {
            case "madeira": limiteMaximo = 50; break;
            case "pedra": limiteMaximo = 70; break;
            case "ferro": limiteMaximo = 100; break;
            case "ouro": limiteMaximo = 30; break;
            case "diamante": limiteMaximo = 150; break;
            case "netherite": limiteMaximo = 200; break;
            default: limiteMaximo = 60;
        }

        durabilidade += quantidade;

        if (durabilidade > limiteMaximo) {
            System.out.println("-> Reparo limitado a " + limiteMaximo);
            durabilidade = limiteMaximo;
        }

        System.out.println("-> Durabilidade nova: " + durabilidade);
    }

    @Override
    public String toString() {
        return "Picareta de " + material + " (D: " + durabilidade + ", F: " + forca + ")";
    }

    public String getMaterial() { return material; }
    public int getDurabilidade() { return durabilidade; }
    public int getForca() { return forca; }
}
