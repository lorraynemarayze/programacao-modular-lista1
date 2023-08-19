package Q6;

import java.util.Scanner;

public class Questao6 {

  public static void main(String[] args) {

    int quantidade;
    int numero1;
    int numero2;
    int numero3;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Deseja inserir quantos conjuntos de três números?");
    quantidade = scanner.nextInt();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o número 1: ");
      numero1 = scanner.nextInt();

      System.out.println("Digite o número 2: ");
      numero2 = scanner.nextInt();

      System.out.println("Digite o número 3: ");
      numero3 = scanner.nextInt();

      ordemCrescente(numero1, numero2, numero3);
    }

    scanner.close();
  }

  static void ordemCrescente(int n1, int n2, int n3) {
    int num1 = n1;
    int num2 = n2;
    int num3 = n3;

    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    System.out.println("A ordem crescente dos números " + n1 + ", " + n2 + ", " + n3 + " é: " + num1 + ", " + num2 + ", " + num3);
  }
}