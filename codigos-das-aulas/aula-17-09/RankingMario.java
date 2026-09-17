import java.util.*;

public class RankingMario {
    public static void main(String[] args) {
        System.out.println("====== PRÁTICA LIST ======");
        List<String> personagens = new ArrayList<>();

        personagens.add("Mario");
        personagens.add("Luigi");
        personagens.add("Peach");
        personagens.add("Yoshi");

        System.out.println(personagens.get(0));
        personagens.remove(3);
        personagens.clear(); // limpa tudo
        System.out.println(personagens);

        List<String> inimigos = new LinkedList<>();
        inimigos.add("Goomba");
        inimigos.add("Koopa");
        inimigos.remove(0);
        System.out.println(inimigos);

        System.out.println("\n====== PRÁTICA MAP ======");

        Map<String, String> habilidades = new HashMap<>();

        habilidades.put("Mario", "Fireball");
        habilidades.put("Luigi", "Poltergust");
        habilidades.put("Yoshi", "Flutter Jump");
        habilidades.put("Peach", "Float");
        habilidades.put("Toad", "Speed Boost");

        String h = habilidades.get("Luigi");
        System.out.println(h);

        for (Map.Entry<String, String> entry : habilidades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n--- Prática 2 ---");

        Map<String, Integer> notas = new HashMap<>();

        notas.put("Gabrielli", 5);
        notas.put("Isadora", 5);
        notas.put("Gabriel", 4);
        notas.put("Barbara", 5);
        notas.put("Emilly", 5);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n====== PRÁTICA HASHSET ======");

        Set<String> roster = new HashSet<>();
        roster.add("Mario");
        roster.add("Luigi");
        roster.add("Peach");
        roster.add("Yoshi");
        roster.add("Toad");

        roster.add("Mario");

        System.out.println("Número de elementos no HashSet: " + roster.size()); // 5
        System.out.println(roster.contains("Luigi")); // true

        roster.remove("Peach");
        System.out.println("Número de elementos no HashSet: " + roster.size()); // 4

        for (String rosterKey : roster) {
            System.out.println(rosterKey);
        }

        System.out.println("\n====== PRÁTICA QUEUE ======");

        PriorityQueue<Integer> fila = new PriorityQueue<>();

        // Goomba = 10, Piranha = 15, Koopa = 20
        fila.add(10);
        fila.add(5);
        fila.add(15);

        // Quem aparece primeiro? (sem remover)
        System.out.println("Primeiro elemento: " + fila.peek()); // 10 Goomba

        // poll: Goomba entra em cena e sai da fila
        System.out.println(fila.poll()); // 10
        System.out.println(fila.peek()); // 15
        System.out.println(fila.poll()); // 15
        System.out.println(fila.peek()); // 20

    }

}
