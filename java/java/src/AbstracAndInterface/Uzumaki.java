package AbstracAndInterface;

public class Uzumaki  extends Ninja  implements ClonesDasSombras{
    public Uzumaki(){
        super();
    }
    public Uzumaki(String nome , AldeiasDeKonoha Aldeia , NivelNinja rank , int numMissoes)
    {

        super(nome,Aldeia,rank,numMissoes);
    }

    @Override
    public void Jutsu()
    {
        System.out.println("Meu nome é: " + nome + " e esse é meu Jutsu");
    }

    public void jutsuClones()
    {
        System.out.println("Justu clones da sombra ativados");
    }
}
