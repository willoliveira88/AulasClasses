import Models.Livros;
public class Main {
      public static void main(String[] args) {
          Livros livros = new Livros ("livros" ," Love" , 2024);
          livros.imprimirInformacoes();
          livros.emprestarLivro();
          livros.emprestarLivro();
          livros.devolverLivro();
      }
  }