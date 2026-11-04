import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        System.out.println(verificaPodeVotar(idadeUsuario));

        sc.close();
    }

    static String verificaPodeVotar(int idadeUsuario){
        if (idadeUsuario < 16){
            return "Você não pode votar";
        } else if (idadeUsuario < 18 || idadeUsuario > 65){
            return "Seu voto é facultativo";
        } else {
            return "Seu voto é obrigatório";
        }
    }
}
