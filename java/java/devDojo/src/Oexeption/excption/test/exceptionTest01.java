package Oexeption.excption.test;

import java.io.File;
import java.io.IOException;

public class exceptionTest01 {
    public static void main(String[] args) {

    }
    //Metodo pra criar aquivo
    public static void criarArquivo(){

        //Criando arquivo com  a classe file e dentro do () tem: a pasta que pode ser colocar o caminho completo ou nao e o nome e tipo do arquivo
        File file = new File("arquivo\\test.tx");

        /*
        Lançando exception: O try signinfica tentar ele vai tentar, no caso criar o arquivo
        Obs : se não tiver nada dentro do {} do try ele da erro por que ele espera que vc mande alguma coisa
        para ele ao menos tentar fazer.
         */
        try{
            //No caso aqui eu estou criando o arquivo , ja passei o local e o tipo na criação do objeto no caso o  " file"
            //e esse boleano é so pra abrir um mensagem afins didaticos que o arquivo esta sendo criado
            //para acesar tudo que eu posso fazer com os aquivos é so colocar um "." depois do nome do ob no caso "file."
            //no  caso estamos usando o meto " createNewFile() ; ja da classe File pra poder criar um arquivo
            boolean estaCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + estaCriado);
        }

        /*
         Cath: è a excessão nele eu coloco tudo que o programa deve fazer ao não conseguir criar um arquivo
         pode ser por nao passar a pasta corretamente ou tipo de arquivo que nao existe e etc

         NAO DEVE SE COLOCAR REGRA DE NEGOCIO NO CATH
         NAO DEVE DEIXAR NUNCA O CATH EM  BRANCO

         DENTRO DO CATH: Dentro do paratese do cath deve se colocar o objeto de acordo com a exception
         nesse caso esta o IOExption ele vai trazer todas as Exceptions da Classe IO , que é a clase de arquivos

         VARIAVEL e:  é uma boa pratica se colocar o nome do objeto de exception com o nome "e"

         Resumindo caso no try o codigo nao consiga fazer o que eu pedi o programa que um objeto do tipo exception de acordo
         com o que eu pedi , nesse cao IO por que estou trabalhando com arquivos " FILE ".
         */
        catch (IOException e)
        {

            /*
             Ao colocar um ponto na varivel assim como qualquer obejto criado eu posso acessar os metodos instaciados
             a aquele objeto no caso abaixo estou usando o .printStackTrace , onde ele vai imprimir todo o caminho da satck
             para que o programador posso encontrar o erro nesse caminho de forma mais facil.
             */
            e.printStackTrace();
        }
    }

}
