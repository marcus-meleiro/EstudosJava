package NivelIntermediario.Desafio2;

public class NinjaAvancado extends NinjaBasico {

    String especialidade;
    public NinjaAvancado()
    {

    }
    public NinjaAvancado(String nome , int idade , String habilidade , String especialidade)
    {
        this.especialidade = especialidade;
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;

    }


    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade + "\nEspecialidade: " + especialidade);
    }

}
