package exercicio02;

public class Film extends Midia {
    private String director;

    public Film(String titulo, int duracao, String director) {
        super(titulo, duracao);
        this.director = director;
    }

    @Override
    public String displayInformation() {
        return super.displayInformation() + "\nDiretor: " + this.director;
    }
}
