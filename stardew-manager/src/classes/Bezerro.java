package classes;

public class Bezerro extends VacaMae {

    public Bezerro(String nome, String raca, int idade) {
        super(nome, raca, idade, 0);
    }

    @Override
    public String getTipo() {
        return "Bezerro";
    }

    @Override
    public String coletarProduto() {
        return getNome() + " é um bezerro e ainda não produz leite.";
    }

}
