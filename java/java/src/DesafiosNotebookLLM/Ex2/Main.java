package DesafiosNotebookLLM.Ex2;

public class Main {
    public static void main(String[] args) {
        Pedido marcus = new Pedido(StatusPedido.CANCELADO);
        System.out.println(StatusPedido.CANCELADO.ordinal());
    }
}
