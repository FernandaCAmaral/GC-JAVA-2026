package exercicio03;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("0001","Carlos Silva",20300);
        System.out.println(account1);
        account1.deposit(500);
        System.out.println(account1);
        account1.withdraw(800);
        System.out.println(account1);
        account1.withdraw(30000);
        System.out.println(account1);

        BankAccount account2 = new SpecialAccount("0001","Eduardo Santos",10000, 1200);
        System.out.println(account2);
        account2.deposit(500);
        System.out.println(account2);
        account2.withdraw(800);
        System.out.println(account2);
        account2.withdraw(10000);
        System.out.println(account2);
        account2.withdraw(1000);
        System.out.println(account2);
    }
}
