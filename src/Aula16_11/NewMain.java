package Aula16_11;

public class NewMain {

    public static void main(String[] args) {

//        
//        Vetor simples tem 1 linha.
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 4;
        }

//        Criando matrix 3x4 (linXcol)
        int[][] matrix = new int[3][4];
//      Percorrendo as linhas da matrix
        for (int l = 0; l < 3; l++) {

//      Percorrendo colunas da matrix
            for (int c = 0; c < 4; c++) {
                matrix[l][c] = l * c;
            }
        }

        for (int l = 0; l < 3; l++) {
//      Percorrendo colunas da matrix
            for (int c = 0; c < 4; c++) {
                System.out.print(matrix[l][c]+"  ");
 
            }
            System.out.println("");

        }
    }
}
