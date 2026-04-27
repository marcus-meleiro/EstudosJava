package ExDoGpt;

public abstract  class ItemBiblioteca {
    private String titulo;
    private int ano;

    public ItemBiblioteca(){}
    public ItemBiblioteca(String titulo , int ano)
    {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public abstract String descricao();
}
