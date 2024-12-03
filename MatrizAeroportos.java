package Individuais;
import javax.swing.JOptionPane;
//Aluno : Rafael, João Vitor e Patrick.
public class MatrizAeroportos {
    public static void main(String[] args) {
        final int numeroAero = 7;
        String[] aeroportos = {"GRU", "CWB", "SDU", "FOR", "POA", "BSB", "MAO"};
        int[][] distancias = new int[numeroAero][numeroAero]; //no caso, num_aeroportos são 7

        JOptionPane.showMessageDialog(null, "Insira as distâncias entre os aeroportos.");
        for (int i = 0; i < numeroAero; i++) {
            for (int j = i; j < numeroAero; j++) {
                if (i == j) {
                    distancias[i][j] = 0; //ja dizia o filósofo, não tem como eu sair de onde eu ja estou
                } else {
                    String input = JOptionPane.showInputDialog(
                            "Distância entre " + aeroportos[i] + " e " + aeroportos[j] + " (em km):"
                    );
                    int distancia = Integer.parseInt(input);
                    distancias[i][j] = distancia;
                    distancias[j][i] = distancia;
                }
            }
        }





        JOptionPane.showMessageDialog(null, "Informe a origem e o destino para saber a distância.\nCaso queira parar, informe a mesma origem e destino.");
        while (true) {
            String origemInput = JOptionPane.showInputDialog("De onde irá partir?:\n" + String.join(", ", aeroportos));
            String destinoInput = JOptionPane.showInputDialog("Diz ai qual o destino:\n" + String.join(", ", aeroportos));

            int origem = -1;
            int destino = -1;

            for (int i = 0; i < numeroAero; i++) {
                if (aeroportos[i].equalsIgnoreCase(origemInput)) {
                    origem = i;
                }
                if (aeroportos[i].equalsIgnoreCase(destinoInput)) {
                    destino = i;
                }
            }

            for (int linha = 0; linha < aeroportos.length; linha++) {
                for (int coluna = 0; coluna < aeroportos.length; coluna++) {
                    System.out.print(distancias[linha][coluna] + " ");
                }
                System.out.println();
            }

            if (origem == destino && origem != -1) {
                JOptionPane.showMessageDialog(null, "Origem e destino iguais. Encerrando programa.");
                break;
            }

            if // a resposta for verdadeira
            (origem != -1 && destino != -1) {
                JOptionPane.showMessageDialog(null, "A distância entre " + aeroportos[origem] + " e " + aeroportos[destino] + " é: " + distancias[origem][destino] + " km.");
            } else //se clicar no Xzinho vai aparecer essa parada{
                JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        }
    }
}

