package Generics;

import java.util.List;

public class BolsaNInja<T> {

    private List<T> ferramentas;

    public BolsaNInja(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    //Adicionar ferramentas
    public void adcionarFerramenta( T ferramenta)
    {
        ferramentas.add(ferramenta);
    }

    //Mostra nossa lista de ferramenta
    public void mostrarFerramentas()
    {
        for(T ferramenta : ferramentas)
        {
            System.out.println(ferramenta);
        }
    }
}
