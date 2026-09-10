package classes;

public class Leitao extends PorcoMae {

    public Leitao(String nome, int idade, String raca) {
        super(nome, idade, raca, 0);
    }

    @Override
    public String coletarProduto() {
        return getNome() + " é um leitãozinho e ainda não produz trufas.";
    }
}
