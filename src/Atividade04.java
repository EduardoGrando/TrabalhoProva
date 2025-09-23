import java.util.Random;

public class Atividade04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
