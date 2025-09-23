import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        for (int jogada = 0; jogada < 9; jogada++) {
            char jogador = (jogada % 2 == 0) ? 'X' : 'O';
            System.out.print("Linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = sc.nextInt();

            tabuleiro[linha][coluna] = jogador;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
