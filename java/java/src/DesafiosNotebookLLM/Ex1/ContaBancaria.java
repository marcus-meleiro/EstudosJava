package DesafiosNotebookLLM.Ex1;

public class ContaBancaria
{

    private double saldo;



    public ContaBancaria(){}

    public ContaBancaria(double saldo)
    {
        this.saldo = saldo;
    }



    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }


    //METODO SACAR COM VALIDAÇÃO
    public void sacar(double saque)
    {
        if (saque < saldo && saque > 0)
        {
            saldo = saldo - saque;

        }
        else
        {
            System.out.println("Saldo insulficiente!");
        }
    }

    //METODO DEPOSITAR COM VALIDAÇÃO
    public void depositar(double deposito)
    {
        if (deposito > 0 )
        {
            saldo = saldo + deposito;
        }

    }


}
