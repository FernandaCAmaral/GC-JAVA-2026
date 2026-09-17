package exercicio04;

public class Warrior extends Character {
    private int physicForce;

    public Warrior(String name, int elixir, int baseDamage, int healthPoints, int physicForce) {
        super(name, elixir, baseDamage, healthPoints);
        this.physicForce = physicForce;
    }

    @Override
    public void attack(Character target) {
        int totalDamage = baseDamage + this.physicForce;

        System.out.println(this.name + " atacou " + target.name + "!");

        target.receiveDamage(totalDamage);
    }

    @Override
    public String toString() {
        return super.toString() + "\nForça Física: " + this.physicForce;
    }
}
