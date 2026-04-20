package AbstracAndInterface;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.Jutsu();
        Sasuke.jutsuClones();

        Uchiha Itachi = new Uchiha( "Itachi Uchiha" ,AldeiasDeKonoha.ALDEIA_DA_FOLHA );
        System.out.println(Itachi.nome);
        System.out.println(Itachi.Aldeia);

        Uchiha Madara = new Uchiha("Madara Uchiha",AldeiasDeKonoha.ALDEIA_DA_FOLHA , NivelNinja.KAGE ,20);
        System.out.println("Eus sou " + Madara.nome + " , sou da " + Madara.Aldeia + " , sou do nivel " + Madara.rank + " e tenho " + Madara.numMissoes + " missões concluidas!" );

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki",AldeiasDeKonoha.ALDEIA_DA_FOLHA,NivelNinja.GENIN,15);

        Naruto.Jutsu();
        Naruto.jutsuClones();

        Itachi.inteligenciDeCombate();
    }
}
