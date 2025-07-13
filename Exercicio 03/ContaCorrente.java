// Subclasse ContaCorrente
class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial) {
        super(numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Sacar considerando cheque especial
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        if (valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Sacado com cheque especial: R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente, incluindo limite do cheque especial.");
            return false;
        }
    }

    //Exercicio 09
    @Override
    public void aplicarJuros() {
        // Aplica 15% de juros no saldo da conta corrente usando getter e setter
        double novoSaldo = getSaldo() + getSaldo() * 0.15;
        setSaldo(novoSaldo);
        System.out.println("Juros de 15% aplicados na Conta Corrente. Novo saldo: R$" + novoSaldo);
    }
}