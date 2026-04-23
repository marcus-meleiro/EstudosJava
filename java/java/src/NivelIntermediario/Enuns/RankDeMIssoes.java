package NivelIntermediario.Enuns;

public enum RankDeMIssoes
 {
    //Rank de Missoes

    D("Baixo" , 2),
    C("Moderado" , 3),
    B("Confortavel" , 4),
    A("Dificil" , 5),
    S("Altissimo" , 12);


    private String descricao;
    private int dificuldade;

    private  RankDeMIssoes(String descricao , int dificuldade) 
    {
      this.descricao = descricao;
      this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }






  
}
