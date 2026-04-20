package EntendoInterfaces.VendoSeAprediMesmo;

public class Main {
    public static void main(String[] args) {
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.aldeia ="Folha";
        Boruto.cla = "Uzumaki Hyuga";

        System.out.print("Meu nome é: "+Boruto.nome + " eu sou da aldeia da  "+Boruto.aldeia+" sou do cl" +
                "ã " + Boruto.cla + " e vou ");

        Boruto.AtivarJougan();
    }
}
