import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Integer numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        Integer numero2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        Integer numero3 = sc.nextInt();

        int[] numeros = {numero1, numero2, numero3};
        double maiorNumero = acharMaior(numeros);
        double menorNumero = acharMenor(numeros);
        double mediaAritmetica = mediaAritmetica(numeros);

        System.out.println("O maior número desta sequência é: " + maiorNumero);
        System.out.println("O menor número desta sequência é: " + menorNumero);
        System.out.println("A média aritmética destes números é: " + mediaAritmetica);

        sc.close();
    }

    static double acharMaior(int[] numeros) {
        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    static double acharMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    static double mediaAritmetica(int[] numeros) {
        double soma = 0.0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
}
