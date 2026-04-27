package TentandoFazerGenerics2;

public class Arma implements Usavel{
    private String nome;
    private int dano;

    public Arma(){}
    public Arma(String nome ,  int dano){
        this.nome = nome;
        this.dano = dano;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDano(){
        return dano;
    }
    public void setDano(int dano){
        this.dano = dano;
    }

    @Override
    public String toString()
    {
        return "Arma: " + nome + " - Dano: " + dano;
    }



    @Override
    public void usar(){
        System.out.println("Atacando com a arma " + nome + " causando " + dano);
    }
}
