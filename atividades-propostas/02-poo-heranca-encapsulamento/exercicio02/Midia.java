package exercicio02;

public class Midia {
    protected String title;
    protected int timeInMinutes;

    public Midia(String title, int timeInMinutes) {
        this.title = title;
        this.timeInMinutes = timeInMinutes;
    }

    public String displayInformation() {
        return "\nTítulo: " + this.title + " | Duração (em minutos): " + this.timeInMinutes;
    }
}
