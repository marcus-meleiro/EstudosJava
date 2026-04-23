package DesafiosNotebookLLM.Ex2;

import java.util.Random;

public class Pedido {
    Random gerador = new Random();

    final private int id = gerador.nextInt();
    private StatusPedido status;

    public Pedido(){}
    public Pedido( StatusPedido status)
    {
        this.status = status;
    }

    public StatusPedido getStatus()
    {
        return status;

    }

    public void setStatus(StatusPedido status)
    {

        this.status = status;
    }
}
