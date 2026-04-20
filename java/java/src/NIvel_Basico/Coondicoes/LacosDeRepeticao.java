package NIvel_Basico.Coondicoes;

public class LacosDeRepeticao {
  public static void main(String[] args) {

    /**
     * Laços de repetição: Vão repetir infinitamente ou até atingir o parametro desejado
     
    * while = for
    
    * 
     */

    //WHILE
    // estrutura basica : while(condicão ){tudo aqui vai acontecer}

    int numClones = 0;
    int numMaxClones = 40;

    /**while(numClones <= numMaxClones)
    { 
      numClones++;  
      System.out.println("O Naruto fez um clone das sombras! : " + numClones);
      
    }*/

    //FOR 

    for(int i = 0; i <= numMaxClones; i++) 
    {
      System.out.println("O naruto esra se clonando e ja se clono: " + i);
    }
      
   }
  
}
