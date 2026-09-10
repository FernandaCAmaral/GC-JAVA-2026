package classes;

public class Leitao extends PorcoMae {

    public Leitao(String nome, String raca, int idade) {
        super(nome, raca, idade, 0);
    }

    @Override
    public String coletarProduto() {
        return getNome() + " é um leitãozinho e ainda não produz trufas.";
    }
}
