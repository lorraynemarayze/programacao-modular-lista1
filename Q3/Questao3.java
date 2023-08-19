package Q3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int funcionarios;
        System.out.print("Deseja informar os dados de quantos funcionários? ");
        funcionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        String[] nome = new String[funcionarios];
        String[] sexo = new String[funcionarios];
        String[] data = new String[funcionarios];

        for (int i = 0; i < funcionarios; i++) {
            System.out.print("Nome do funcionário " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();
            System.out.print("Sexo do funcionário " + (i + 1) + ": ");
            sexo[i] = scanner.nextLine();
            System.out.print("Data de nascimento do funcionário " + (i + 1) + " (AAAA-MM-DD): ");
            data[i] = scanner.nextLine();
        }

        System.out.println("Relatório dos Funcionários:");

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Sexo: " + sexo[i]);
            System.out.println("Data de Nascimento: " + data[i]);
            System.out.println();
        }

        System.out.println("Dados de " + funcionarios + " funcionários foram preenchidos.");

        int fem = 0;
        int masc = 0;

        for(int i = 0; i < funcionarios; i++){
            if(sexo[i].equals("Feminino")){
                fem += 1;
            }else{
                masc += 1;
            }
        } 
        
        System.out.println("De " + funcionarios + " funcionários, " + fem + " são mulheres, o que equivale a " + ((fem*100.0)/funcionarios) + "%");
        System.out.println("De " + funcionarios + " funcionários, " + masc + " são homens, o que equivale a " + ((masc*100.0)/funcionarios) + "%");

        float mediaGeral = 0;
        float mediaFem = 0;
        float mediaMasc = 0;

        for(int i = 0; i < funcionarios; i++){
            LocalDate nascimento = LocalDate.parse(data[i]);
            LocalDate hoje = LocalDate.now();
            Period idade = Period.between(nascimento, hoje);

            int anos = idade.getYears();
            mediaGeral += anos;

            if(sexo[i].equals("feminino")){
                mediaFem += anos;
            }else{
                mediaMasc += anos;
            }
        }

        mediaGeral /= funcionarios;
        mediaFem /= fem;
        mediaMasc /= masc;

        System.out.println("Média Geral de Idade dos Funcionários: " + mediaGeral + " anos.");
        System.out.println("Média de Idade das Funcionárias: " + mediaFem + " anos.");
        System.out.println("Média de Idade dos Funcionários: " + mediaMasc + " anos.");

        scanner.close();
    }
}
