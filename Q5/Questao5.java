package Q5;

import java.util.Scanner;

public class Questao5 {

  public static void main(String[] args) {

    int quantidade;
    double salario;
    int filhos;
    double acumulador = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Deseja inserir os dados de quantas pessoas?");
    quantidade = scanner.nextInt();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Digite o salário: ");
      salario = scanner.nextDouble();
      acumulador += salario;

      System.out.println("Digite a quantidade de filhos: ");
      filhos = scanner.nextInt();

      mediaSalarialPopulacao(acumulador, quantidade);
    }
    
    scanner.close();
  }

  static void mediaSalarialPopulacao(double renda, int pessoas) {
    double media;
    media = renda / pessoas;
    System.out.println("A média salarial da população é de " + media);
  }
}

