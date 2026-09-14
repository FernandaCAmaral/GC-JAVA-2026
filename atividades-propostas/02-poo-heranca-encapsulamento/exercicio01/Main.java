package exercicio01;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Carlos Silva", 5000);
        Employee manager1 = new Manager("Eduardo Santos", 7500, 1250);

        System.out.println("=== LISTA DE FUNCIONÁRIOS ===");
        System.out.println(employee1);
        System.out.println(manager1);
    }
}
