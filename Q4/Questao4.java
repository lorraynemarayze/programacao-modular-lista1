package Q4;
import java.util.Scanner;

public class Questao4 {

  public static void main(String[] args) {

    int quantidade;
    int n1;
    int n2;
    int n3;
    char letra;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Deseja calcular a nota de quantos alunos?");
    quantidade = scanner.nextInt();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite a nota 1: ");
      n1 = scanner.nextInt();

      System.out.println("Digite a nota 2:");
      n2 = scanner.nextInt();

      System.out.println("Digite a nota 3:");
      n3 = scanner.nextInt();

      System.out.println("Digite a letra:");
      letra = scanner.next().charAt(0);

      notas(n1, n2, n3, letra);
    }
    scanner.close();
  }

  static void notas(int nota1, int nota2, int nota3, char letra) {
    double media;
    if (letra == 'A') {
      media = (nota1 + nota2 + nota3) / 3.0;
      System.out.println("Média Aritmética: " + media);
    } else if (letra == 'P') {
      media = (nota1 * 5.0 + nota2 * 3.0 + nota3 * 2.0) / 10.0;
      System.out.println("Média Ponderada: " + media);
    } else {
      System.out.println("Digite uma letra válida - A ou P.");
    }
  }
}
