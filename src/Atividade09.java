import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[5][2];
        double[] medias = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite duas notas do aluno " + (i + 1) + ":");
            notas[i][0] = sc.nextDouble();
            notas[i][1] = sc.nextDouble();
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + " - Média: " + medias[i]);
        }
        sc.close();
    }
}
