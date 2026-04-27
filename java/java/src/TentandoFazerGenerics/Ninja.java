package TentandoFazerGenerics;

public  class  Ninja {
    private String nome;
    private int idade;
    private NivelNinja rank;

    public Ninja(){}
    public Ninja(String nome,int idade,NivelNinja rank)
    {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(){
        this.idade = idade;
    }

    public NivelNinja getRank()
    {
        return rank;
    }
    public void setRank(NivelNinja rank){
        this.rank = rank;
    }


}
