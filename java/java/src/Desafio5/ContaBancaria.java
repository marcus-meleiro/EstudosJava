package Desafio5;

import java.util.Random;

public abstract class ContaBancaria implements Conta{

    //VARIAVEIS

   protected int id;
    String nome;
    String aldeia;
    TipoDeConta tipo;
    double saldo;

    //GERADOR ALEATORIO DE ID
    protected static final Random geradorId = new Random(1000);

    //CONSTRUTOR UNIVERSAL - OBS: SALDO INICIANDO EM 0.0 E ID SENDO GERADO ALEATORIAMENTE
    public ContaBancaria()
    {
        this.id = geradorId.nextInt(1000);
        this.saldo = 0.0;
    }

    //CONSTRUTOR PASSANDO AS VARIAVEIS  - OBS: SALDO INICIANDO EM 0.0 E ID SENDO GERADO ALEATORIAMENTE
    public ContaBancaria(String nome,String aldeia, TipoDeConta tipo)
    {
        this.id = geradorId.nextInt(1000);
        this.nome = nome;
        this.aldeia = aldeia;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    //METODO PARA CONSULTA DE SALDO
    public abstract double consultarSaldo();

    //METODO PARA DEPOSITOS
    public abstract double depositarSaldo(double valor);










}
