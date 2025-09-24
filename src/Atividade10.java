import java.util.Random;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[][] mar = new int[7][7];
        int navioLinha = random.nextInt(7);
        int navioColuna = random.nextInt(7);
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();

            if (linha == navioLinha && coluna == navioColuna) {
                System.out.println("Você acertou o navio!");
                acertou = true;
            } else {
                System.out.println("Água!");
            }
        }
        sc.close();
    }//
}
