package EntendoAMateriaAteConstrutores.Exercicio1;

public class Equipamento {
    String nome;
    String tipo;
    int poder;

    public Equipamento()
    {

    };

    public Equipamento(String nome, String tipo, int poder)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;

    }
    public void exibirArsenal()
    {
        System.out.println("Nome: " + nome + "\nTipo: " + tipo + "\nPoder: " + poder);
    }

}
