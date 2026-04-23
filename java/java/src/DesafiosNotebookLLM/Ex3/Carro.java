package DesafiosNotebookLLM.Ex3;

public class Carro extends Veiculo{

    private int numPortas;


    public Carro(){super();}
    public Carro(String placa , int ano , String cor , String marca , String modelo)
    {
        super(placa,ano,cor,marca,modelo);
    }


    public void setNumPOrtas(int numPortas)
    {
        this.numPortas = numPortas;
    }

    public int getNumPortas()
    {
        return numPortas;
    }


}
