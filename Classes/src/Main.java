import Models.Calculadora;
import Models.Carros;

public class Main {
    public static void main(String[] args) {
        Carros carros = new Carros("Mercedes" ,  "200" ,  2022  ,   4  );
        carros.display();
    }
}