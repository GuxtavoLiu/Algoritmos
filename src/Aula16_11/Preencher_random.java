package Aula16_11;

import java.util.Random;

public class Preencher_random {

    public static void main(String[] args) {
        Random r = new Random();

        int[][] matriz = new int[5][10];
// criando e preenchendo
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 10; c++) {
                matriz[l][c] = r.nextInt(100);
            }
        }
//PERCORRENDO MATRIZ
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matriz[l][c] + "  ");
            }
            System.out.println("");
        }

        int maior = 0;
        int menor = 100;
        int posx = 0;
        int posy = 0;
//SELECIONANDO O MAIOR NUMERO DA MATRIZ
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 10; c++) {
                if (maior < matriz[l][c]) {
                    maior = matriz[l][c];
                    posx = l+1;
                    posy = c+1;

                }
                if (menor > matriz[l][c]) {
                    menor = matriz[l][c];
                }

            }
        }

        //CALCULANDO A MÉDIA ARITMÉTICA
        System.out.println(""
                + ""
                + ""
                + "");
        System.out.println("Maior número da matriz é: " + maior);
        System.out.println("Posição do Maior: \n"
                + "Linha = " + posx + "\n"
                + "Coluna = " + posy);
        System.out.println("Menor número da matriz é: " + menor);
    }
}
