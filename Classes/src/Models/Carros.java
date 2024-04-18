package Models;

public class Carros extends Veiculos {

          private   int numeroDePortas;

            public Carros (String marca, String modelo, int ano, int numeroDePortas){
                super ( marca , modelo, ano );
                this.numeroDePortas = numeroDePortas;
            }
            public void display(){
                System.out.println ( "Marca -> " + marca);
                System.out.println ( "Modelo -> " + modelo);
                System.out.println ("Ano -> " + ano );
                System.out.println ("Numero de Portas -> " + numeroDePortas);
            }
}
