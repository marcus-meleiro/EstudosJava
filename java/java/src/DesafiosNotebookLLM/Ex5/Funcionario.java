package DesafiosNotebookLLM.Ex5;

public abstract class Funcionario
{
    private String nome;
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(){}
    public Funcionario(String nome , int matricula , double salario , String cargo)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getMatricula()
    {
        return  matricula;
    }
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public double getSalario()
    {
        return salario;
    }
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo =  cargo;
    }

    public abstract void calcularBonus();
}
