package exercicio01;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n -> Bônus: R$ " + this.bonus +
                " | Total: R$ " + calculateSalary();
    }
}
