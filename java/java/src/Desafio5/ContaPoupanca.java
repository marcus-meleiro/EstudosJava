package Desafio5;

public class ContaPoupanca extends ContaBancaria
{
    public ContaPoupanca()
    {
        super();
    }

    public ContaPoupanca(String nome, String aldeia, TipoDeConta tipo)
    {
        super();
        super.nome = nome;
        super.aldeia = aldeia;
        super.tipo = tipo;

    }

    //METODO PARA CONSULTA DE SALDO
    @Override
    public double consultarSaldo()
    {
        System.out.println("Seu é : " + saldo);

        return saldo;
    }

    //METODO PARA DEPOSITOS

    @Override
    public double depositarSaldo(double valor)
    {
        saldo = saldo + (valor - (valor * 0.01));s

        System.out.println("Seu novo saldo é : " + saldo);
        return saldo;

    }
}
