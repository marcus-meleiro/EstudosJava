package ExDoGpt;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(){}
    public Usuario(String nome , List livrosEmprestados)
    {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void mostrarLivrosEmprestados() {
        for (Livro livro : livrosEmprestados)
       {
           livro.toString();
       }
    }
}
