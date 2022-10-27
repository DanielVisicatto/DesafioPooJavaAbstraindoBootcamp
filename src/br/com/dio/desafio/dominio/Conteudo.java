package br.com.dio.desafio.dominio;

// classe abstrata não pode ser instanciada.
// esta classe serve para que possamos implementar estes métodos nas classes filhas através de heraça.
public abstract class Conteudo{

    //Um curso tem um conteúdo.

    protected static final double XP_PADRAO = 10d;   //palavra final para determinar uma constante.

    private String titulo;
    private String descricao;

    public abstract  double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
