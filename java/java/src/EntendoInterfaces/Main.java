package EntendoInterfaces;

public class Main {
    public static void main(String[] args) {
        Terno Terno = new Terno();
        Terno.nome = "Terno";
        System.out.print("Nome: " + Terno.nome + "Eu estou ");
        Terno.fantasia();

        UniformeDeBombeiro Uniforme = new UniformeDeBombeiro();
        Uniforme.nome = "Uniforme de Bombeiro";
        System.out.print("Nome: " + Uniforme.nome + "Eu estou ");
        Uniforme.fantasia();

        RoupaDeCachorro Roupa = new RoupaDeCachorro();
        Roupa.nome = "Roupa de Cachorro";
        System.out.println("Nome: " + Roupa.nome + "Eu estou ");
        Roupa.fantasia();




    }
}
