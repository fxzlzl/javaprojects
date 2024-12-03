package tests;
import java.util.Scanner;
public class ChurrasTop {

    static int carneBovina = 4;    // 2 kg (4 itens de 500g)
    static int tulipa = 2;         // 1 kg (2 itens de 500g)
    static int linguiçaFrango = 2; // 1 kg (2 itens de 500g)
    static int farofa = 1;         // 1 kg (1 item de 1kg)
    static int refrigerante = 5;   // 5 litros (5 itens de 1 litro)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Amigo " + (i + 1) + ", é a sua vez de escolher os itens:");
            escolherItens(scanner);
        }

        System.out.println("\nItens restantes:");
        System.out.println("Carne bovina: " + carneBovina + " disponível(s)");
        System.out.println("Tulipa: " + tulipa + " disponível(s)");
        System.out.println("Linguiça de frango: " + linguiçaFrango + " disponível(s)");
        System.out.println("Farofa: " + farofa + " disponível(s)");
        System.out.println("Refrigerante: " + refrigerante + " disponível(s)");

        scanner.close();
    }

    public static void escolherItens(Scanner scanner) {
        int escolhas = 0;

        // O amigo pode escolher até 2 itens
        while (escolhas < 2) {
            mostrarOpcoes();  // Mostra os itens disponíveis

            System.out.print("Escolha um item (1 a 5): ");
            int escolha = scanner.nextInt();  // Lê a escolha do amigo

            if (escolha == 1 && carneBovina > 0) {
                carneBovina--;  // Se o amigo escolheu carne, diminui a quantidade
                escolhas++;  // Incrementa a quantidade de escolhas feitas
            } else if (escolha == 2 && tulipa > 0) {
                tulipa--;  // Se escolheu tulipa, diminui a quantidade
                escolhas++;
            } else if (escolha == 3 && linguiçaFrango > 0) {
                linguiçaFrango--;  // Diminui a quantidade de linguiça
                escolhas++;
            } else if (escolha == 4 && farofa > 0) {
                farofa--;  // Diminui a quantidade de farofa
                escolhas++;
            } else if (escolha == 5 && refrigerante > 0) {
                refrigerante--;  // Diminui a quantidade de refrigerante
                escolhas++;
            } else {
                System.out.println("Esse item não está disponível ou já acabou. Escolha outro.");
            }
        }
    }

    // Função para mostrar os itens disponíveis
    public static void mostrarOpcoes() {
        System.out.println("\nOpções disponíveis:");
        if (carneBovina > 0) System.out.println("1. Carne bovina - " + carneBovina + " disponível(s)");
        if (tulipa > 0) System.out.println("2. Tulipa - " + tulipa + " disponível(s)");
        if (linguiçaFrango > 0) System.out.println("3. Linguiça de frango - " + linguiçaFrango + " disponível(s)");
        if (farofa > 0) System.out.println("4. Farofa - " + farofa + " disponível(s)");
        if (refrigerante > 0) System.out.println("5. Refrigerante - " + refrigerante + " disponível(s)");
    }
}
