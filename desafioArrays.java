import java.util.Scanner;

public class desafioArrays {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[10];

            System.out.println("Digite 10 números inteiros:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            System.out.println("Os números inteiros inseridos são:");
            for (int i = 0; i < 10; i++) {
                System.out.println(numeros[i]);
            }

            scanner.close();
        }


}
