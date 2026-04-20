package NIvel_Basico.Coondicoes.SwithCase;

import java.util.Scanner;

public class swithCase {
    public static void main(String[] args) {

        //Pèdir para o usuario
        Scanner sc = new Scanner(System.in);

        //Mostrar opções para o usuario
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher uma das opções

        int escolhaDoUsuario = sc.nextInt();

        System.out.println("Você Digitou o numero: " + escolhaDoUsuario);

        switch(escolhaDoUsuario)
        {
            case 1:
                 System.out.println("Usuario escolheu Naruto Uzuamaki , o futuro HOkage");
                break;
            case 2:
                System.out.println("Usuario escolheuy Sasuke Uchiha , o ninja mais revoltado");
                break;
            case 3:
                System.out.println("Usuario escolheu Sakura Haruno , a personagem feminina mais legaol!");
                break;
            default:
                System.out.println("Ninja não econtrado! , tente novamente");
                break;


        }
    }





}
