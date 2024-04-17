package Models;

public class Livros {
    private static String titulo;
    private static String autor;
    private static int anoDePublicacao;
    private static boolean estaEmprestado;

    // Construtor
    public  Livros(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.estaEmprestado = false; // Inicializa como não emprestado
    }

    // Método para emprestar o livro
    public static void emprestarLivro() {
        if (estaEmprestado == false) {
            System.out.println("Erro: O livro já está emprestado.");
            estaEmprestado = true;
        } else {
            estaEmprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        }
    }

    // Método para devolver o livro
    public static void devolverLivro() {
        if (estaEmprestado == false) {
            System.out.println("Erro: O livro não está emprestado.");
        } else {
            estaEmprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        }
    }

    // Método para imprimir todas as informações do livro
    public static void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);

    }
}





