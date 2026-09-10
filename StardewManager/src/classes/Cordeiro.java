package classes;

public class Cordeiro extends OvelhaMae {

    public Cordeiro(String nome, String raca, int idade) {
        super(nome, raca, idade, 0);
    }

    @Override
    public String coletarProduto() {
        return getNome() + " é um cordeiro e ainda não produz lã.";
    }
}
