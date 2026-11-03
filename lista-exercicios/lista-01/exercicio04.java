import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        double SALARIO_MINIMO = 1320;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double qntdSalarioMinimo = quantosSalariosMinimos(SALARIO_MINIMO, salarioUsuario);
        System.out.println("Seu salário é equivalente à: " + qntdSalarioMinimo + " salários minímos.");

    }

    static double quantosSalariosMinimos(double salarioMinimo, double salarioUser) {
        double qntdSalarioMinimo = salarioUser / salarioMinimo;
        return qntdSalarioMinimo;
    }
}
