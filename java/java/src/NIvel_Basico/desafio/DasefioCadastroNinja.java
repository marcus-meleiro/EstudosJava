package NIvel_Basico.desafio;

import java.util.Scanner;

public class DasefioCadastroNinja {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int option = 10;
    String[] ninja = new String[10];
    int i = 0;
    while(option !=0 || i > 9)
    {
          System.out.println("Digite uma opção a seguir: ");
          System.out.println("1 - CADASTRAR NINJA");
          System.out.println("2 - MOSTRAR NINJAS CADASTRADOS");
          System.out.println("0 - SAIR");

          option = sc.nextInt();
          sc.nextLine();

         
              
          switch (option) 
            {
                case 1:
                  System.out.println("Insira o nome do ninja: ");
                  ninja[i] = sc.nextLine();                    
                  i++;                           
                break;
                case 2:
                  System.out.println("lista de Ninjas cadastrados: ");
                  for(int j = 0 ; ninja[j]!= null ; j++)
                  {
                    System.out.println(ninja[j]);
                  }
                   
                break;

                default:
                    option = 0;
                    break;
            }        
           
         
    }

    System.out.println("Você selecionou a opção sair ou a lista de ninjas se completou!");
    System.out.println("Lista de ninjas  atualizada: ");

    for(int j = 0 ; ninja[j] != null ; j++)
    {
      System.out.println(ninja[j]);

    }    
    
  }
  
}
