package ExSalario;

import java.util.Arrays;
import java.util.List;

public class Funcionario {


    private String nome;
    private int idade;
    private double[] salario;

    public Funcionario(){}

    public Funcionario(String nome , int  idade , double... salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario= salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String toString()
    {
        return "\n\nnome: " + nome + "\nidade: " + idade +  "\nsalarios: " + Arrays.toString(salario) + "\n\n";
    }

    public void mostrar(){

        System.out.println(toString());

    }

    public double media()
    {
        double soma = 0;
        double media;
        for (int i = 0; i < 3 ; i++) {
            soma += salario[i];
        }
        media = soma / 3;

        return media;
    }
}