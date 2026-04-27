package TentandoFazerGenerics;

import java.util.ArrayList;
import java.util.List;

public class AldeiaDaFolha <T>{
   private List<T> ninjas;


    public AldeiaDaFolha() {
        this.ninjas = new ArrayList<>();
    }

    //ADICIONAR NINJAS A ALDEIA
    public void addNinja(T ninja)
    {
        ninjas.add(ninja);
    }

    //MOSTRAR NINJAS DA ALDEIA
    public void mostrarNinjas()
    {
        for (T ninja: ninjas)
        {
            System.out.println(ninjas);
        }

    }
}
