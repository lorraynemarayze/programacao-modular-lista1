package Q8;

public class Questao8 {
    public static void main(String[] args) {

        int[][] matriz = {
            {5, 10, 7, 8},
            {13, 4, 1, 3},
            {9, 2, 6, 5},
            {10, 7, 4, 9}
        };

        matrizTransposta(matriz);
        diagonalSecundaria(matriz);
        multiplicarPorConstante(matriz, 3);
        inverterLinhaColuna(matriz, 2); 
    }

    static void exibirMatriz(int[][] matriz) {
        for (int[] row : matriz) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void matrizTransposta(int[][] matriz) {
        System.out.println("Matriz Transposta:");
        int rows = matriz.length;
        int cols = matriz[0].length;

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matriz[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void diagonalSecundaria(int[][] matriz) {
        int size = matriz.length;
        int soma = 0;

        for (int i = 0; i < size; i++) {
            soma += matriz[i][size - i - 1] * matriz[i][size - i - 1];
        }

        System.out.println("Soma dos quadrados da diagonal secundária: " + soma);
    }

    static void multiplicarPorConstante(int[][] matriz, int constante) {
        int rows = matriz.length;
        int cols = matriz[0].length;

        System.out.println("Matriz multiplicada por " + constante + ":");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matriz[row][col] *= constante;
                System.out.print(matriz[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void inverterLinhaColuna(int[][] matriz, int linhaOuColuna) {
        int size = matriz.length;

        for (int i = 0; i < size; i++) {
            int temp = matriz[i][linhaOuColuna];
            matriz[i][linhaOuColuna] = matriz[linhaOuColuna][i];
            matriz[linhaOuColuna][i] = temp;
        }

        System.out.println("Matriz com 3ª linha e 3ª coluna invertidas:");
        exibirMatriz(matriz);
    }
}