package classes;
import interfaces.Animal;

public class PorcoMae implements Animal {
    private String nome;
    private String raca;
    private int idade;
    private int qntTrufas;

    public PorcoMae(String nome, String raca, int idade, int qntTrufas) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.qntTrufas = qntTrufas;
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
        return "Porco";
    }

    @Override
    public String emitirSom() {
        return "Óinc!";
    }

    @Override
    public String coletarProduto() {
        if (qntTrufas == 0) {
            return nome + " não tem trufas pra coletar agora.";
        }
        String resultado = nome + " produziu " + qntTrufas + " trufa(s)!";
        qntTrufas = 0;
        return resultado;
    }

}
