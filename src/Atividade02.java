import java.util.Random;

public class Atividade02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Pares: ");
        for (int n : numeros) {
            if (n % 2 == 0) System.out.print(n + " ");
        }

        System.out.print("\nÍmpares: ");
        for (int n : numeros) {
            if (n % 2 != 0) System.out.print(n + " ");
        }//
    }
}
