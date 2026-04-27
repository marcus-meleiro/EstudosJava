package TentandoFazerGenerics2;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T> {
    List<T> itens = new ArrayList<>();

    public Inventario(){
        this.itens = new ArrayList<>();
    }

    public void add(T item){
        itens.add(item);
    }
    public void mostrarIventario(){
        for(T item : itens)
        {
            System.out.println(item);
        }
    }
}
