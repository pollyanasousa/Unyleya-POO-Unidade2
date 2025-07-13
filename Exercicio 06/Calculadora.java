// Classe Calculadora que realiza operações matemáticas básicas com polimorfismo por sobrecarga
public class Calculadora {

    // Soma dois números inteiros
    public int soma(int a, int b) {
        return a + b;
    }

    // Soma dois números decimais
    public double soma(double a, double b) {
        return a + b;
    }

    // Subtração de dois números inteiros
    public int subtrai(int a, int b) {
        return a - b;
    }

    // Subtração de dois números decimais
    public double subtrai(double a, double b) {
        return a - b;
    }

    // Multiplicação de dois números inteiros
    public int multiplica(int a, int b) {
        return a * b;
    }

    // Multiplicação de dois números decimais
    public double multiplica(double a, double b) {
        return a * b;
    }

    // Divisão de dois números inteiros (retorna double para evitar perda de precisão)
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return (double) a / b;
    }

    // Divisão de dois números decimais
    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return a / b;
    }
}
