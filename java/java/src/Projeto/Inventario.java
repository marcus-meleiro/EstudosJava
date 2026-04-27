package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Inventario <T>{
    List<T> inventario = new ArrayList<>();

    public Inventario() {
        this.inventario = new ArrayList();
    }

    public void add(T jutsu)
    {
        inventario.add(jutsu);
    }

    public T pegarItem(int index) {
        return inventario.get(index);
    }
}
