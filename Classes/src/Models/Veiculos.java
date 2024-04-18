package Models;

    abstract class Veiculos {
    String marca;
    String modelo;
    int ano;
    int portas;

    public Veiculos( String marca , String modelo , int ano ){
        this.marca = marca;
        this.modelo= modelo;
        this.ano = ano;
    }

}
