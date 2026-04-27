package Oexeption.excption.test;

public class exption {
    public static void main(String[] args) {

    }

    public static int dividir(int a , int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nenhum numero pode ser dividir por :0");
        }
        return a / b;
    }
}
