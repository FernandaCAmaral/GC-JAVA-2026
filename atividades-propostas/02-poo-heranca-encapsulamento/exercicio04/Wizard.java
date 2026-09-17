package exercicio04;

public class Wizard extends Character {
    private int mana;

    public Wizard(String name, int elixir, int baseDamage, int healthPoints, int mana) {
        super(name, elixir, baseDamage, healthPoints);
        this.mana = mana;
    }

    @Override
    public void attack(Character target) {
        int totalDamage;

        if (this.mana >= 10) {
            this.mana -= 10;
            totalDamage = baseDamage * 2;

            System.out.println(this.name + " lançou um feitiço poderoso em " + target.name + "!");
        } else {
            totalDamage = baseDamage;

            System.out.println(this.name + " está sem mana suficiente e fez um ataque básico em " + target.name + "!");
        }

        target.receiveDamage(totalDamage);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMana: " + this.mana;
    }
}
