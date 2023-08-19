package Q7;

import java.util.Scanner;

public class Questao7 {

  public static void main(String[] args) {
    int quantidade;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Deseja inserir quantos números em cada vetor?");
    quantidade = scanner.nextInt();

    int vetA[] = new int[quantidade];
    int vetB[] = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o número (Vetor A): ");
      vetA[i] = scanner.nextInt();
    }

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o número (Vetor B): ");
      vetB[i] = scanner.nextInt();
    }

    int[] vetorResultante = somaVetores(vetA, vetB, quantidade);

    System.out.print("A soma dos vetores, organizada ao contrário é: ");
    for (int i = 0; i < quantidade; i++) {
      System.out.print(vetorResultante[i] + " ");
    }

    scanner.close();
  }

  static int[] somaVetores(int vetorA[], int vetorB[], int tam) {
    int vetorResultante[] = new int[tam];

    for (int i = 0; i < tam; i++) {
      vetorResultante[tam - i - 1] = vetorA[i] + vetorB[i];
    }

    return vetorResultante;
  }
}