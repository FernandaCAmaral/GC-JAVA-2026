package classes;

public class Pintinho extends GalinhaMae {

    public Pintinho(String nome, String raca, int idade) {
        super(nome, raca, idade, 0);
    }

    @Override
    public String getTipo() {
        return "Pintinho";
    }

    @Override
    public String emitirSom() {
        return "piu piu!";
    }

    @Override
    public String coletarProduto() {
        return getNome() + " é um pintinho e ainda não produz ovos.";
    }
}
