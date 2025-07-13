// Classe principal para testar as contas
public class PrincipalContaBancaria {
    public static void main(String[] args) {
        // Criar uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente("1234-5", 1000.0, 500.0);
        System.out.println("Conta Corrente criada. Saldo: R$" + contaCorrente.getSaldo());
        
        contaCorrente.depositar(200);
        contaCorrente.sacar(1500);  // Usa cheque especial
        System.out.println("Saldo após saque: R$" + contaCorrente.getSaldo());

        // Criar uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("9876-5", 2000.0, 6.0);
        System.out.println("\nConta Poupança criada. Saldo: R$" + contaPoupanca.getSaldo());

        contaPoupanca.aplicarRendimentoMensal();
        System.out.println("Saldo após rendimento: R$" + contaPoupanca.getSaldo());

        contaPoupanca.sacar(500);
        System.out.println("Saldo após saque: R$" + contaPoupanca.getSaldo());
        System.out.println();

        // Aplicando juros do exercicio 09
        contaCorrente.aplicarJuros();
        contaPoupanca.aplicarJuros();
    }
}
