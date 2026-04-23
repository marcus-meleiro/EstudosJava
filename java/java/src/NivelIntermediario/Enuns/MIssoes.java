package NivelIntermediario.Enuns;

public class MIssoes {
  String nome;
  RankDeMIssoes rank;

 

  public MIssoes()
  {

  }

  public MIssoes(String nome, RankDeMIssoes rank) 
  {
    this.nome = nome;
    this.rank = rank;
  }
  

     public void exibirDetalhes()
  {
    System.out.println("Missao: " + nome + " Ranks: " + rank +  " Descrição: " + rank.getDescricao());
  }
  



}
