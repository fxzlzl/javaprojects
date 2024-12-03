package listaJ;

import java.util.*;
//Alunos : Rafael, João Vitor, Patrick e Fernanda.
public class atvBra {
    public static void main(String[] args) {
        // Lista dos times
        String[] times = {
                "Atlético-MG", "Atlético-PR", "Bahia", "Botafogo", "Corinthians", "Coritiba",
                "Cruzeiro", "Cuiabá", "Flamengo", "Fluminense", "Fortaleza", "Goiás",
                "Grêmio", "Internacional", "Palmeiras", "Bragantino", "Santos",
                "São Paulo", "Vasco", "América-MG"
        };

        int[] votos = new int[20]; // Array para armazenar votos de cada time
        int totalEntrevistados = 0; // Contador de entrevistados
        int somaIdades = 0; // Soma das idades para calcular a média
        int maiorIdade = 0; // Maior idade
        int menorIdade = Integer.MAX_VALUE; // Menor idade

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do time e a idade de cada entrevistado. Digite '-1' para sair.");

        while (true) {
            // Mostra a lista de times com números
            System.out.println("\nTimes:");
            for (int i = 0; i < times.length; i++) {
                System.out.println(i + " - " + times[i]);
            }

            // Lê o time escolhido pelo usuário
            System.out.print("Escolha o número do time (ou '-1' para sair): ");
            int escolhaTime = scanner.nextInt();
            if (escolhaTime == -1) break; // Sai do loop se digitar '-1'
            if (escolhaTime < 0 || escolhaTime >= times.length) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite a idade do entrevistado: ");
            int idade = scanner.nextInt();

            votos[escolhaTime]++;
            totalEntrevistados++;
            somaIdades += idade;
            if (idade > maiorIdade) maiorIdade = idade;
            if (idade < menorIdade) menorIdade = idade;
        }

        System.out.println("\n--- Resultados da Pesquisa ---");

        System.out.println("Total de participantes: " + totalEntrevistados);

        System.out.println("\nQuantidade de votos por time (em ordem decrescente):");

        List<Map.Entry<String, Integer>> listaVotos = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            listaVotos.add(new AbstractMap.SimpleEntry<>(times[i], votos[i]));
        }


        listaVotos.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : listaVotos) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
        }

        double mediaIdade = (totalEntrevistados > 0) ? (double) somaIdades / totalEntrevistados : 0;
        System.out.printf("\nMédia de idade dos participantes: %.2f anos\n", mediaIdade);

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
    }
}
