package DesafiosNotebookLLM.Ex4;

public class Gato extends Animal{
    public Gato(){super();}
    public Gato(String nome)
    {
        super(nome);
    }

    @Override
    public void somAnimal()
    {
        System.out.println("Miau-Miau");
    }
}
