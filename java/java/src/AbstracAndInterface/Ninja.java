package AbstracAndInterface;

public abstract class Ninja implements EstrategiaNinja {
    String nome;
    AldeiasDeKonoha Aldeia;
    NivelNinja rank;
    int numMissoes;

    public Ninja() {

    }
    public Ninja(String nome, AldeiasDeKonoha Aldeia)
    {
        this.nome = nome;
        this.Aldeia = Aldeia;
    }
    public Ninja(String nome, AldeiasDeKonoha aldeia ,NivelNinja rank , int numMissoes )
    {
        this(nome,aldeia);
        this.rank = rank;
        this.numMissoes = numMissoes;
    }

    public abstract void Jutsu();



    public void inteligenciDeCombate() {
        System.out.println("Eu tenho Intelifencia em combate");
    }
}
