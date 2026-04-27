package Oexeption.error.teste;

public class StakeOverFlowTeste01 {
    public static void main(String[] args) {
        recursividade();

    }
    public static void recursividade()
    {
        recursividade();
    }

    //ERRO É UYMA COISA QUE ACONBTECE NA JVM QUE NAO TEM COMO ARRUMAR EM EXECUÇÃO
    // CLASSE THROWABÇLE TEM ERRO E EXCEPITION
    // ERROR É UMA SUBCLASSSE DE ERRO
    // EXCEPTION TEM COMO  ARRUMAR EM PRODUÇÃO

}
