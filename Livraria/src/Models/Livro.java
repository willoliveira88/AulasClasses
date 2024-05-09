package Models;

/**
 * classe que represeta umlivro . Contendo ISBN,titulo,autor e ano publicação.
 */

public class Livro {

    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicaçõa;

    /**
     * construtor que instancia um objeto do tipo livro
     * @param isbn           identificador unico do libro.
     * @param titulo         Titulo do livro.
     * @param autor          Autor do livro.
     * @param anoPublicaçõa  Ano da Publicação .
     *
     */

    public Livro(String isbn, String titulo, String autor, int anoPublicaçõa) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaçõa = anoPublicaçõa;


    }
    /**
     * construtor sem argumentos do objeto LIVRO. todos os atributos serao nulos
     */

    public Livro(){}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicaçõa() {
        return anoPublicaçõa;
    }

    public void setAnoPublicaçõa(int anoPublicaçõa) {
        this.anoPublicaçõa = anoPublicaçõa;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicaçõa=" + anoPublicaçõa +
                '}';
    }

}
