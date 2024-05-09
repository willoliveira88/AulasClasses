package Models;
/**
 * Classe responsavel por gerenciar os livros. Possui UMA LISTA DE LIVROS  que implementa os metodos CRUD(creat,read,update,delete)
 * para a lista
 */

   import java.util.ArrayList;
   import java.util.List;

public class GerenciadorLivros {
    private List<Livro> listadeLivros = new ArrayList<>();

    /**
     * construtor da classe Gerenciador de LiVROS. Alista ja fi inicializada
     * dentro da classe, nao é necessario passar por parametro.
     */
    public GerenciadorLivros() {

    }

    /**
     * Metodo responsavel por adicionar um livro a lista de livros.
     * sera usado o metodo .add da classe ARRAYLIST para adicionar.
     * Não pode ser adicionado um livro com ISBN igual á um existente
     * ma lista .Para isso a lista é iterada e o ISBN do livro dentro da lista é comparado com o ISBN do livropara adicionar
     * Será utilizado o metodo .equals da classe String para fazer a comparação.
     *
     * @param livroParaadicionar Objeto do tipo Livro que sera adicionado.
     */
    public void adiconarLivro(Livro livroParaadicionar) {
        for (Livro livroDentroDaLista : listadeLivros) {
            if (livroDentroDaLista.getIsbn().equals(livroParaadicionar.getIsbn())) {
                System.out.println("Este livro ja esta Cadastrado");
            } else {
                listadeLivros.add(livroParaadicionar);
                System.out.println("Livro adiconado com Sucesso!");
            }
        }
    }

    /**
     * Retorna todos os livros dentro da lista
     *
     * @return listaDeLivros a ser retornada
     */
    public List<Livro> listarTodosLivros() {
        if (listadeLivros.isEmpty()) {
            System.out.println("Não ha livros na lista ");
            return listadeLivros;
        }
        return listadeLivros;
    }

    public void listarTodososlivros2aForma() {
        if (listadeLivros.isEmpty()) {
            System.out.println("Não ha livros na lista ");
        }
        listadeLivros.forEach((System.out::println));
    }

    public void listarTodososlivros3aForma() {
        if (listadeLivros.isEmpty()) {
            System.out.println("Não ha livro na Lista");
        }
        listadeLivros.forEach((System.out::println));
    }

    /**
     * Metodo para obter livro por id (ISBN) .
     * METODD .equals da classe String é utilizado para comparar o ISBN Fornecido com o .getISBN
     *
     * @param ISBNparaSerBuscado ISBN que esta sendo buscado
     * @return Livro que tem ISBN igual ao buscado
     */
    private Livro obterLivroPorISBN(String ISBNparaSerBuscado) {
        for (Livro livroDentrodaLista : listadeLivros) {
            if (livroDentrodaLista.getIsbn().equals(ISBNparaSerBuscado)) {
                return livroDentrodaLista;
            } else {
                System.out.println("Livro não Encontrad");
            }
        }
        return null;
    }
     public void atualizarLivro(String ISBNparaSerBuscado , String novoTitulo, String novoAutor, int novoAnoPublicação){
        Livro livro = obterLivroPorISBN(ISBNparaSerBuscado);
        if (livro == null){
            System.out.println("Este livro naofoi Cadastrado");
        }else {
            livro.setTitulo(novoTitulo);
            livro.setAnoPublicaçõa(novoAnoPublicação);
            livro.setAutor(novoAutor);
            System.out.println("Livro atualizado com sucesso");
            System.out.println(livro);
        }

     }

    /**
     *
     * Metodo para remover livro da lista
     * @param ISBNparaSerBuscado  codigo do livro a ser buscado
     */
    public void removerLivro(int ISBNparaSerBuscado){
       boolean removido = listadeLivros.removeIf(livro -> livro.getIsbn().equals(ISBNparaSerBuscado));
        if (removido){
            System.out.println("Livro removido com sucesso ");

        }else{
            System.out.println("Livro com ISBN:" + ISBNparaSerBuscado + " NAO ENCONTRADO! ");
        }
    }

    }











