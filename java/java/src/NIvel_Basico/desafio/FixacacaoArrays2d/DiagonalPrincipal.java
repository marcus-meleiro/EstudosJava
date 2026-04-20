package NIvel_Basico.desafio.FixacacaoArrays2d;

import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz  = new int[5][5];
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("digite umn número para a posição: ["+(i+1)+","+(j+1)+"]" );
                matriz[i][j] = sc.nextInt();
            }

        }

        System.out.println("MATRIZ: ");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
               if (i == j) {
                   diagonalPrincipal+=matriz[i][j];
               }
            }

        }

        System.out.println("DIAGONAL PRINCIPAL: " + diagonalPrincipal);

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 5) {
                    diagonalSecundaria+=matriz[i][j];
                }
            }

        }
        System.out.println("DIAGONAL SEGUNDARIA: " + diagonalSecundaria);

        sc.close();


    }
}
