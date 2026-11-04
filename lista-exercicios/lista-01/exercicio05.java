import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int SEGUNDOS_EM_UM_DIA = 86400;
        int SEGUNDOS_EM_UMA_HORA = 3600;
        int SEGUNDOS_EM_UM_MINUTO = 60;

        int hora = 10;
        int minuto = 30;
        int segundo = 5;

        int segundosPassados = (hora * SEGUNDOS_EM_UMA_HORA) + (minuto * SEGUNDOS_EM_UM_MINUTO) + segundo;

        int segundosQueFaltam = SEGUNDOS_EM_UM_DIA - segundosPassados;

        System.out.printf("Horário analisado: %dh %dmin %ds\n", hora, minuto, segundo);
        System.out.printf("Segundos passados desde às 0h00min0s: %d segundos\n", segundosPassados);
        System.out.printf("Segundos que faltam para a meia-noite: %d segundos\n", segundosQueFaltam);
    }
}
