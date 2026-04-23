package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("========== Naruto Uzumaki ==========");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 30,1.78);
        System.out.println("Meu nome é " + Naruto.getNome());
        Naruto.setNome("Naruto Uzumaki Hyuga");
        System.out.println("Meu nome é " + Naruto.getNome() + " com o nome alterado");



        System.out.println("========== Sasuke Uchiha ==========");

        /** Não pode esquecer que:
                 o seteer altera a variavel
                 e o getter mostra a variavel
                 set = altera e get = mostrar
                 **/

    }
}
