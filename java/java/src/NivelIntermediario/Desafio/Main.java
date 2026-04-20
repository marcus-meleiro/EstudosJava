package NivelIntermediario.Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ninja[] ninja = new Ninja[10];
        Uchiha[] uchiha = new Uchiha[10];
        int option = 10;
        String cla;
        int u = 0;
        int n = 0;


        while (option != 0) {
            System.out.println("=== INSIRA UMA OPÇÃO: ");
            System.out.println("1 - Adiconar novo  ninja\n2 - Exibir informações de todos os ninjas\n0 -  Sair");


            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:

                    System.out.println("Insira clã do ninja a ser inserido: ");
                    cla = sc.nextLine();


                    if (cla.equalsIgnoreCase("UCHIHA")) {
                        uchiha[u] = new Uchiha();
                        System.out.println("Digie o nome do Ninja do clã UCHIHA: ");
                        uchiha[u].nome = sc.nextLine();
                        System.out.println("Digite a idade do ninja:");
                        uchiha[u].idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a missão do ninja: ");
                        uchiha[u].missao = sc.nextLine();
                        System.out.println("Digite a difuldade da missão: ");
                        uchiha[u].dificuldadeMIssao = sc.nextLine();
                        System.out.println("Digite o status da missão: ");
                        uchiha[u].statusMissao = sc.nextLine();
                        System.out.println("Digite a habilidade especial do ninja: ");
                        uchiha[u].habilidadeEspecial = sc.nextLine();

                        System.out.println("Deseja exibir as informções do ninja que acabou de inserir ?\nDigite y/n :");
                        String exibir = sc.nextLine();

                        if (exibir.charAt(0) == 'y'  || exibir.charAt(0) == 'Y')
                        {
                            uchiha[u].mostrarInfo();

                        }
                        u++;


                    } else {
                        ninja[n] = new Ninja();
                        System.out.println("Digite o nome do ninja a ser inserido: ");
                        ninja[n].nome = sc.nextLine();
                        System.out.println("Digite a idade do ninja:");
                        ninja[n].idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a missão do ninja: ");
                        ninja[n].missao = sc.nextLine();
                        System.out.println("Digite a dificuldade da missão: ");
                        ninja[n].dificuldadeMIssao = sc.nextLine();
                        System.out.println("Digite so status da missão: ");
                        ninja[n].statusMissao = sc.nextLine();


                        System.out.println("Deseja exibir as informções do ninja que acabou de inserir ?\nDigite y/n :");
                        String exibir = sc.nextLine();

                        if (exibir.charAt(0) == 'y'  || exibir.charAt(0) == 'Y')
                        {
                            ninja[n].mostrarInfo();

                        }

                        n++;

                    }

                    break;
                case 2:
                    System.out.println("Ninja: ");
                    for (int i = 0; ninja[i] != null ; i++) {
                        ninja[i].mostrarInfo();

                    }
                    System.out.println("Uchiha: ");
                    for (int i = 0; uchiha[i] != null ; i++) {
                        uchiha[i].mostrarInfo();

                    }
                    break;
                default:
                    break;
            }

        }





    }
}
