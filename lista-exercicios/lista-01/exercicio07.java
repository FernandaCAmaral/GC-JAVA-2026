import java.util.Scanner;

public class exercicio07 {
    static final double SALARIO_MINIMO_EXIGIDO = 2000;
    static final int IDADE_MINIMA = 18;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        System.out.println("Digite seu salário atual: ");
        double salarioUsuario = sc.nextDouble();

        verificaCriterios(idadeUsuario, salarioUsuario);
        sc.close();
    }

    static void verificaCriterios (int idade, double salario){
        boolean apto = true;
        if(salario <= SALARIO_MINIMO_EXIGIDO){
            System.out.printf("\nSeu salário de R$ %.2f é insuficiente para comprar um automóvel.\nVALOR MÍNIMO: %.2f", salario, SALARIO_MINIMO_EXIGIDO);
            apto = false;
        } else {
            System.out.println("\nSeu salário se encaixa nos critérios para compra do automóvel.");
        }

        if(idade < IDADE_MINIMA) {
            System.out.println("\nVocê deve ter 18+ para comprar um automóvel");
            apto = false;
        } else {
            System.out.printf("\nVocê tem %d anos, então se encaixa no critério de idade.", idade);
        }

        if(apto){
            System.out.println("\nParabéns! Você passou nos critérios e pode comprar um automóvel.");
        } else {
            System.out.println("\nInfelizmente você não passou em nossos critérios...");
        }
    }
}
