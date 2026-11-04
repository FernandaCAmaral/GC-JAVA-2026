import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        double SALARIO_MINIMO = 1320;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double qntdSalarioMinimo = quantosSalariosMinimos(SALARIO_MINIMO, salarioUsuario);
        System.out.printf("Seu salário é equivalente à: %.2f salário(s) minímo(s)", qntdSalarioMinimo);

        sc.close();
    }

    static double quantosSalariosMinimos(double salarioMinimo, double salarioUser) {
        double qntdSalarioMinimo = salarioUser / salarioMinimo;
        return qntdSalarioMinimo;
    }
}
