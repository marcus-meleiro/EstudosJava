package Projeto;

public class Jutsu {
    private String nome;
    private int dano;
    private double custoChakra;

    public Jutsu(){}

    public Jutsu(String nome, int dano, double custoChakra) {
        this.nome = nome;
        this.dano = dano;
        this.custoChakra = custoChakra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public double getCustoChakra() {
        return custoChakra;
    }

    public void setCustoChakra(double custoChakra) {
        this.custoChakra = custoChakra;
    }
}
