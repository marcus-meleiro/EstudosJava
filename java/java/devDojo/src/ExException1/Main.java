package ExException1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor ddo chackra mpo naruto:");
        int chackra = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero de clones: ");
        int clones = sc.nextInt();
        sc.nextLine();

        System.out.println("cada clone vai ter: " + dividirChackra(chackra,clones) + " de chackra");

    }
    private static int dividirChackra(int chackra , int clones)
    {
       try{
           if (chackra <=  0)
           {
               throw new IllegalArgumentException("Número de Chackras tem que ser maior que 0");
           }
           if (clones <= 0)
           {
               throw new IllegalArgumentException("Numero de clones está errado não tem como ter 0 clones");

           }

           return chackra / clones;

        }
       catch (RuntimeException e)
       {
           e.printStackTrace();
       }
        return 0;
    }





}
