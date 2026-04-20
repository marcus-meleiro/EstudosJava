package NivelIntermediario.Desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastre o ninja:");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.print("Habilidade: ");
        String habilidade = input.nextLine();
        System.out.println("Especialidade: ");
        String especialidade = input.nextLine();

        NinjaAvancado ninja = new NinjaAvancado(nome, idade ,  habilidade, especialidade);

        ninja.mostrarInformacoes();

    }
}

