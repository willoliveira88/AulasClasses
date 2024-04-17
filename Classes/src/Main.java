import Models.Calculadora;
public class Main {
    public static void main(String[] args) {
        /** Criando uma Calculadora com Classe Adição,Multiplicação,Subtração,Divisão.
         *  e imprimir os resultados na tela do Terminal
         */
        Calculadora calculo = new Calculadora();
        calculo.adicao(15,12);
        calculo.multiplicacao(8,7);
        calculo.subtracao(11,11);
        calculo.divisao(10,0);
    }
}