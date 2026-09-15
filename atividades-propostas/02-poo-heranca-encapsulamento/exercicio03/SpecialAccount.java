package exercicio03;

public class SpecialAccount extends BankAccount {
    private double limit;

    public SpecialAccount(String accountNumber, String name, double balance, double limit) {
        super(accountNumber, name, balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Processando saque de R$ " + amount + "...");

        double availableBalance = this.getBalance() + this.limit;
        double remainingLimit = this.limit + this.getBalance();

        if (amount > availableBalance) {
            System.out.println("❌ Limite ultrapassado! Seu limite atual é de: R$ " + remainingLimit);
            return;
        }

        this.balance -= amount;
        System.out.println("✅ Saque de R$ " + amount + " realizado com sucesso!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Limite Total: R$ " + this.limit;
    }
}
