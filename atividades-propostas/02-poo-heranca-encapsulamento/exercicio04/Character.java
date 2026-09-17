package exercicio04;

public abstract class Character {
    protected String name;
    protected int elixir;
    protected int baseDamage;
    protected int healthPoints;

    public Character(String name, int elixir, int baseDamage, int healthPoints) {
        this.name = name;
        this.elixir = elixir;
        this.baseDamage = baseDamage;
        this.healthPoints = healthPoints;
    }

    public abstract void attack(Character target);

    public void receiveDamage(int quantity) {
        this.healthPoints -= quantity;

        if (this.healthPoints < 0) {
            this.healthPoints = 0;
        }

        System.out.println(this.name + " recebeu " + quantity + " de dano. Vida Restante: " +
                this.healthPoints);
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " | Elixir: " + this.elixir +
                " | BaseDamage: " + this.baseDamage + " | Vida: " + this.healthPoints;
    }
}
