package ExSalario;

public class Main {
    public static void main(String[] args) {

        Funcionario fun1 = new Funcionario("Marcus Meleiros" , 26 , 1800.00,1500.00,1600.00);
        fun1.mostrar();
        System.out.println(fun1.media());
    }
}
