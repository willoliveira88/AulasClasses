package Models;

public class ContaBancaria {
    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    // Construtor para inicializar os atributos numeroDaConta e nomeDoTitular
    public ContaBancaria(String numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0.0; // Saldo inicializado como 0
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Aumenta o saldo
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor; // Diminui o saldo
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para imprimir o extrato da conta
    public void imprimirExtrato() {
        System.out.println("Nome do Titular: " + this.nomeDoTitular);
        System.out.println("Número da Conta: " + this.numeroDaConta);
        System.out.println("Saldo Atual: R$" + this.saldo);
    }
}