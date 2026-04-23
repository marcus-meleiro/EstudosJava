package DesafiosNotebookLLM.Ex4;

public class Cachorro extends Animal{

    public Cachorro(){super();}
    public Cachorro(String nome)
    {
        super(nome);
    }

    @Override
    public void somAnimal()
    {
        System.out.println("Au-Au");
    }
}
