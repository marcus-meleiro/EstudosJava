package AbstracAndInterface;

public class Uchiha extends Ninja implements ClonesDasSombras {

   public Uchiha()
   {
       super();
   }
   public Uchiha(String nome, AldeiasDeKonoha Aldeia)
   {
       super.nome = nome;
       super.Aldeia = Aldeia;
   }
   public Uchiha(String nome, AldeiasDeKonoha Aldeia, NivelNinja rank , int numMissoes)
    {
        super(nome , Aldeia ,rank , numMissoes);

    }

    @Override
    public void Jutsu()
    {
        System.out.println("Preparar para clonar!");

    }
   public  void jutsuClones()
    {
        System.out.println("Jutsu Clones das sombras ativado!");

    }



}
