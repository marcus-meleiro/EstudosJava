package EntendoAMateriaAteConstrutores.Exercicio1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String nome;
        String tipo;
        int poder;


        Scanner sc = new Scanner(System.in);

        Equipamento[] equipamentos = new Equipamento[3];



        for (int i = 0; i < 3; i++)
        {
            System.out.print("Digite o nome do equipamento: ");
            nome = sc.nextLine();
            System.out.print("Digite o tipo do equipamento: ");
            tipo = sc.nextLine();
            System.out.print("Digite o poder dp equipamento: ");
            poder = sc.nextInt();
            sc.nextLine();

            equipamentos[i] = new Equipamento(nome,tipo,poder);





        }


        equipamentos[0].exibirArsenal();
        equipamentos[1].exibirArsenal();
        equipamentos[2].exibirArsenal();
    }

}
