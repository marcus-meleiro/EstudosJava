package NivelIntermediario.Desafio2;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade);

    }

    @Override
    public void executarHabilidade()
    {
        System.out.println("Executando Habilidade");
    }
}
