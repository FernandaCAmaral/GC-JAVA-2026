package classes;
import interfaces.Animal;

public class VacaMae implements Animal {
    private String nome;
    private String raca;
    private int idade;
    private int baldesDeLeite;

    public VacaMae(String nome, String raca, int idade, int baldesDeLeite) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.baldesDeLeite = baldesDeLeite;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public String emitirSom() {
        return "Muu!";
    }

    @Override
    public String coletarProduto() {
        if (baldesDeLeite == 0) {
            return nome + " não tem leite pra coletar agora.";
        }
        String resultado = nome + " produziu " + baldesDeLeite + " balde(s) de leite!";
        baldesDeLeite = 0;
        return resultado;
    }
}
