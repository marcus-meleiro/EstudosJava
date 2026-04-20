package NIvel_Basico.Coondicoes.ScanerDoUsuario;

import java.util.Scanner;

public class ScannerDoUsuario {


        public static void main(String[] args) {

            Scanner caixaDeTexto = new Scanner(System.in);
            String nomeNinja;
            System.out.println("Digite o nome do ninja: ");
            nomeNinja = caixaDeTexto.nextLine();

            System.out.println(nomeNinja);

            System.out.println("Esvreva aqui a idade do seu ninja: ");
            int idadeNinja = caixaDeTexto.nextInt();

            System.out.println("Idade do seu nija é : " + idadeNinja + " anos");

            if (idadeNinja >= 18)
            {
                System.out.println("Ninja maior de idade e pode ir para missões para fora da aldeia");

            }
            else {
                System.out.println("Esse ninja é muito novo precisa treinar mais para sari em missões fora da aldeia!");
            }

            caixaDeTexto.close();






        }
    }