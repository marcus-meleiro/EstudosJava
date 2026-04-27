package ExDoGpt;

public class Livro extends ItemBiblioteca{

    private String autor;
    private boolean disponivel;

    public Livro(){
        super();
    }
    public Livro(String titulo , int ano , String autor , boolean disponivel)
    {
        super(titulo,ano);
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String descricao(){
        return "Nome: " + getTitulo() + "\nAno: " + getAno() + "\nAutor: " + getAutor() + "\n Está disponivel: " + isDisponivel();

    }
    @Override
    public String toString()
    {
        return getTitulo();
    }

}
