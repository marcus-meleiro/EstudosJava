package Desafio5;

public class ContaCorrente extends ContaBancaria
{


    public ContaCorrente()
    {
        super();
    }

    public ContaCorrente(String nome, String aldeia, TipoDeConta tipo)
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
        return saldo;
    }

    //METODO PARA DEPOSITOS
    @Override
    public double depositarSaldo(double valor)
    {
        saldo = saldo + valor;
        return saldo;

    }
}
