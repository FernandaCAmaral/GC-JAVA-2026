package exercicio03;

public class BankAccount {
    protected String accountNumber;
    protected String name;
    protected double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositando R$ " + amount + "...");
        this.balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("Processando saque de R$ " + amount + "...");
        if (this.balance < amount) {
            System.out.println("❌ Saldo insuficiente! Seu saldo atual é de R$ " + this.balance + ".");
            return;
        }
        this.balance -= amount;
        System.out.println("✅ Saque de R$ " + amount + " realizado com sucesso!");
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "\nNúmero da conta: " + this.accountNumber + " | Nome do Titular: " + this.name
                + "\nSaldo: R$ " + this.balance;
    }
}
