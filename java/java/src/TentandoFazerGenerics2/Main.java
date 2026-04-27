package TentandoFazerGenerics2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventario<Object> bolsaDeArmas = new Inventario<>();
        bolsaDeArmas.add(new Arma("Shuriken",99));
        bolsaDeArmas.add(new Arma("Kunai" , 85));

        bolsaDeArmas.add(new Pergaminho("Pergaminho de Gen-Jutsu" , 70));
        bolsaDeArmas.add(new Pergaminho("Pergaminho de Tai-Jutsu",52));

        bolsaDeArmas.mostrarIventario();

        List<Usavel> maoDoNinja = new ArrayList<>();
        maoDoNinja.add(new Arma("AK-47" , 78));
        maoDoNinja.add(new Pergaminho("Tratado de tordesilhas", 101));

        for (Usavel mao : maoDoNinja)
        {
            mao.usar();
        }
    }
}
