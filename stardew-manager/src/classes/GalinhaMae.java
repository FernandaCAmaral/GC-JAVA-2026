package classes;
import interfaces.Animal;

public class GalinhaMae implements Animal {
    private String nome;
    private String raca;
    private int idade;
    private int ovosNoNinho;

    public GalinhaMae (String nome, String raca, int idade, int ovosNoNinho) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.ovosNoNinho = ovosNoNinho;
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
        return "Galinha";
    }

    @Override
    public String emitirSom() {
        return "Có Cóó!";
    }

    @Override
    public String coletarProduto() {
        if (ovosNoNinho == 0) {
            return nome + " não tem ovos pra coletar agora.";
        }
        String resultado = nome + " produziu " + ovosNoNinho + " ovo(s)!";
        ovosNoNinho = 0;
        return resultado;
    }
}
