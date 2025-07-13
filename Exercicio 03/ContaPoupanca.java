// Subclasse ContaPoupanca
class ContaPoupanca extends ContaBancaria {
    private double taxaRendimentoAnual;

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimentoAnual) {
        super(numeroConta, saldo);
        this.taxaRendimentoAnual = taxaRendimentoAnual;
    }

    public double getTaxaRendimentoAnual() {
        return taxaRendimentoAnual;
    }

    public void setTaxaRendimentoAnual(double taxaRendimentoAnual) {
        this.taxaRendimentoAnual = taxaRendimentoAnual;
    }

    // Aplica rendimento mensal na poupança
    public void aplicarRendimentoMensal() {
        double rendimentoMensal = (getSaldo() * (taxaRendimentoAnual / 100)) / 12;
        setSaldo(getSaldo() + rendimentoMensal);
        System.out.println("Rendimento aplicado: R$" + String.format("%.2f", rendimentoMensal));
    }

    //Exercicio 09
    @Override
    public void aplicarJuros() {
        // Aplica 6,5% de juros no saldo da conta poupança usando getter e setter
        double novoSaldo = getSaldo() + getSaldo() * 0.065;
        setSaldo(novoSaldo);
        System.out.println("Juros de 6,5% aplicados na Conta Poupança. Novo saldo: R$" + novoSaldo);
    }
}
