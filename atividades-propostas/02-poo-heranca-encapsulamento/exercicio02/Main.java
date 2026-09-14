package exercicio02;

public class Main {
    public static void main(String[] args) {

        Midia film1 = new Film("O Senhor dos Anéis: A Sociedade do Anel", 178, "Peter Jackson");
        Midia audiobook1 = new AudioBook("Harry Potter e a Pedra Filosofal", 530, "Ícaro Silva");

        System.out.println(film1.displayInformation());
        System.out.println(audiobook1.displayInformation());
    }
}
