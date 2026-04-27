package TentandoFazerGenerics;

public class Main {
    public static void main(String[] args) {

        AldeiaDaFolha<Object> ninjasDafolha = new AldeiaDaFolha<>();

        Ninja naruto = new Ninja("Naruto Uzumaki",17,NivelNinja.GENNIN);

        ninjasDafolha.addNinja(naruto);
        ninjasDafolha.mostrarNinjas();


    }
}
