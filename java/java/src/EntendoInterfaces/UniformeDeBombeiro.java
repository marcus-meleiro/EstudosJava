package EntendoInterfaces;

public class UniformeDeBombeiro implements Fantasia {
    String tecido ;
    String usuario;
    String nome;

    @Override
    public void fantasia() {
        System.out.println("Fantasiado");
    }

}
