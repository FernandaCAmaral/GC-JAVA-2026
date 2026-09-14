package classes;
import interfaces.Animal;

public class OvelhaMae implements Animal {
    private String nome;
    private String raca;
    private int idade;
    private int quantidadeLa;

    public OvelhaMae(String nome, String raca, int idade, int quantidadeLa) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.quantidadeLa = quantidadeLa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getTipo() {
        return "Ovelha";
    }

    @Override
    public String emitirSom() {
        return "Mééé!";
    }

    @Override
    public String coletarProduto() {
        if (quantidadeLa == 0) {
            return nome + " não tem lã pra coletar agora.";
        }
        String resultado = nome + " produziu " + quantidadeLa + " pedaço(s) de lã!";
        quantidadeLa = 0;
        return resultado;
    }
}
