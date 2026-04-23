package DesafiosNotebookLLM.Ex3;

public abstract class Veiculo {

    private String placa;
    private int ano;
    private String cor;
    private String marca;
    private String modelo;

    public Veiculo(){}

    public Veiculo(String placa , int ano, String cor , String marca , String modelo)
    {
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;


    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
