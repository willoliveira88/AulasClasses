  import Models.ContaBancaria;
import Models.Pessoa;

public class Main {
    public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria("358987-8", "Willian");
            conta.imprimirExtrato();
            conta.depositar(1600);
            conta.sacar(450);
            conta.imprimirExtrato();


        }
    }