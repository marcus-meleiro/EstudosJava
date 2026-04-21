package Desafio5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BancoKonoha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;


        System.out.println("===== BEM VINDO AO BANCO DE KONOHA =====");

        System.out.println("Escolha uma das opções para prosseguir!");
        System.out.println("Digite: ");
        System.out.println("1 -  Criar conta corrente");
        System.out.println("2 -  Criar conta poupança");
        option = sc.nextInt();
        sc.nextLine();

        switch (option)
        {
            case 1:
                System.out.println("Digite seu  nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite sua aldeia: ");
                String aldeia = sc.nextLine();
                ContaCorrente CC = new ContaCorrente(nome,aldeia,TipoDeConta.CORRENTE);
                System.out.println("Sua conta corrente foi criada, seu numero de id é: " +CC.id);

                System.out.println("Escolha uma das opções para prosseguir!");
                System.out.println("Digite: ");
                System.out.println("1 -  Consultar Saldo");
                System.out.println("2 -  Depositar");
                option = sc.nextInt();
                sc.nextLine();

                switch (option)
                {
                    case 1:
                        CC.consultarSaldo();
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser depositado: ");
                        double deposito = sc.nextInt();
                        sc.nextLine();

                        CC.depositarSaldo(deposito);
                        break;
                    default:
                        System.out.println("opção invalida!");
                }

                break;

            case 2:
                System.out.println("Digite seu  nome: ");
                String nome2= sc.nextLine();
                System.out.println("Digite sua aldeia: ");
                String aldeia2 = sc.nextLine();
                ContaPoupanca CP = new ContaPoupanca(nome2,aldeia2,TipoDeConta.POUPANCA);
                System.out.println("Sua conta popança foi criada, seu numero de id é: " + CP.id);

                System.out.println("Escolha uma das opções para prosseguir!");
                System.out.println("Digite: ");
                System.out.println("1 -  Consultar Saldo");
                System.out.println("2 -  Depositar");
                option = sc.nextInt();
                sc.nextLine();

                switch (option)
                {
                    case 1:
                        CP.consultarSaldo();
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser depositado: ");
                        double deposito = sc.nextInt();
                        sc.nextLine();

                        CP.depositarSaldo(deposito);
                        break;
                    default:
                        System.out.println("opção invalida!");
                }
                break;


            default:
                System.out.println("Opção invalida! Tente novamente.");
        }







    }
}
