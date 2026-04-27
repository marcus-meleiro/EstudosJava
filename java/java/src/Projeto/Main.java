package Projeto;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto Uzumaki");
        Ninja sasuke =  new Ninja("Sasuke Uchiha");

        naruto.aprender(new Jutsu("Clones das Sombras" ,15,25.00));
        sasuke.aprender(new Jutsu("Bola de fogo" , 15 , 30.0));

        naruto.atacar(sasuke , naruto.jutsu.pegarItem(0));
        sasuke.atacar(naruto , naruto.jutsu.pegarItem(0));

        naruto.atacar(sasuke , naruto.jutsu.pegarItem(0));
        sasuke.atacar(naruto , naruto.jutsu.pegarItem(0));

        naruto.atacar(sasuke , naruto.jutsu.pegarItem(0));
        sasuke.atacar(naruto , naruto.jutsu.pegarItem(0));



    }
}
