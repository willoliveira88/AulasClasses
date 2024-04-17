package Models;
public class Calculadora {
    /**
     * Imprimir os Resultados da Adição,Subtração,Divisão,Multiplicação
     * @param n1
     * @param n2
     */
    public static void adicao(float n1 , float n2){
        System.out.println("A Soma é = " + (n1 + n2));
    }
    public static void subtracao(float n1 , float n2){
        System.out.println("A subtração é = " + (n1-n2));
    }
    public static void multiplicacao(float n1 , float n2){
        System.out.println("A multiplicação é = " + (n1*n2));
    }
    public static void divisao(float n1 , float n2){
        if(n2 == 0){
            System.out.println("A resposta é igual a " + 0);
        }
        else{
            System.out.println("A divisão é = "  + (n1/n2));
        }
    }
}