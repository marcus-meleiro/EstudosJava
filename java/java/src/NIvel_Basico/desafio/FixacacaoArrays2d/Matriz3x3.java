package NIvel_Basico.desafio.FixacacaoArrays2d;

import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = new int [3][3];
        int[][] matrizT = new int [3][3];
        int soma = 0;


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um  número para a posição: " + "[" + i + "]" + "[" + j + "]");
                matriz[i][j] = sc.nextInt();

            }

        }
        System.out.println("MATRIZ: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizT[j][i] = matriz[i][j];

            }

        }
        System.out.println("NOVA MATRIZ: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                System.out.print(matrizT[i][j] + " ");

            }
            System.out.println();

        }
        sc.nextLine();

        /**System.out.println("Digite um número para buscar: ");
        int buscar = sc.nextInt();
        int cont_busc = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (buscar == matriz[i][j])
                {
                    System.out.println("Posição: " + "[" + i + "]" + "[" + j + "]" );
                    i = matriz.length;
                }
                else
                {
                    cont_busc++;
                }

            }

        }
        if  (cont_busc == matriz.length) {
            System.out.println("Número não encontrado");
        }
       /**
        media = (double) soma/ (double) cont;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);**/

        sc.close();

    }


}
