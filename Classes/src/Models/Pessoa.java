package Models;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void falar() {
        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.idade + " anos " + this.altura + " altura ");
    }
}
