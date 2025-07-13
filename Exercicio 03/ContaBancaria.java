// Superclasse ContaBancaria
public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    // Construtor da conta bancária
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Getters e setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: R$" + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Método genérico para aplicar juros Exercicio 09
    public void aplicarJuros() {
        
    }

}   
