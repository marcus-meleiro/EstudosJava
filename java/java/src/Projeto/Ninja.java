package Projeto;

public class Ninja implements Combate{
    private String nome;
    private int hp = 100;
    private double ptsChakra = 100.00;
    Inventario<Jutsu> jutsu = new Inventario<>();

    public Ninja(){}
    public Ninja(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    public double getPtsChakra() {
        return ptsChakra;
    }

    public void setPtsChakra(double ptsChakra) {
        this.ptsChakra = ptsChakra;
    }

    @Override
    public void atacar(Ninja adversario , Jutsu jutsu){
        if(ptsChakra < jutsu.getCustoChakra())
        {
            System.out.println("Você não CHAKRA suficiente , se recupere!");
        }
        else
        {
            adversario.setHp(adversario.getHp() - (int) jutsu.getDano());
            setPtsChakra(ptsChakra - jutsu.getCustoChakra());
            if (adversario.getHp() < 0)
            {
                System.out.println("O " + adversario.nome + " foi DERROTADO!");
            }

            System.out.println("💥 " + this.nome + " usou o jutsu " + jutsu.getNome() + "!");
            System.out.println("🩸 " + adversario.getNome() + " sofreu " + jutsu.getDano() + " de dano!");
            System.out.println("📊 HP do " + adversario.getNome() + " agora é: " + adversario.getHp());
            System.out.println("--------------------------------------------------");
        }

    }

    public void aprender(Jutsu newJutsu)
    {
        jutsu.add(newJutsu);
    }


}
