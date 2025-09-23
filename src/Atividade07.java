import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transposta:");
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
