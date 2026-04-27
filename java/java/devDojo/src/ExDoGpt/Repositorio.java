package ExDoGpt;

import java.util.ArrayList;
import java.util.List;

public class Repositorio <T>{
    List<T> repositorio = new ArrayList<>();

    public Repositorio() {
        this.repositorio = new ArrayList<>();
    }

    public void adicionar(T item)
    {
        repositorio.add(item);
    }

    public void remover(T item)
    {
        repositorio.remove(item);
    }
    public List<T> listar()
    {
        return repositorio;
    }
}
