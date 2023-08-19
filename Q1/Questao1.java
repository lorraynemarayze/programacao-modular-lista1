package Q1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int vetA[] = new int[15];
        int vetB[] = new int[15];
        int fatorial;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            vetA[i] = num;
        }

        for (int i = 0; i < 15; i++) {
            int num = vetA[i];
            fatorial = 1;
            for (int j = 1; j <= num; j++) {
                fatorial *= j;
            }
            vetB[i] = fatorial;
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("O fatorial do número " + vetA[i] + " é: " + vetB[i]);
        }

        scanner.close();
    }
}
