package exercicio02;

public class AudioBook extends Midia {
    private String narrator;

    public AudioBook(String titulo, int duracao, String narrator) {
        super(titulo, duracao);
        this.narrator = narrator;
    }

    @Override
    public String displayInformation() {
        return super.displayInformation() + "\nNarrador: " + this.narrator;
    }
}
