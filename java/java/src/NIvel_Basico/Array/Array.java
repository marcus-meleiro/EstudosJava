package NIvel_Basico.Array;

import java.util.Scanner;

public class Array {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] ninjas = new String[6];
    int[] idade = new int[2];

    
    for (int i = 0 ; i < 5 ; i++)
    {
      System.out.println("Digite o nome do ninja na posição: " + (i+1));
      ninjas[i] = sc.nextLine();
      
    }
    for (int i = 0 ; i < 2 ; i++)
    {
      System.out.println("Digite a idade  do ninja na posição: " + (i+1));
      idade[i] = sc.nextInt();
      
    }
    


    
  }
  
}
