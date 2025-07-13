// Classe para testar a Calculadora com polimorfismo
public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testando soma
        System.out.println("Soma int: 5 + 3 = " + calc.soma(5, 3));
        System.out.println("Soma double: 5.5 + 3.2 = " + calc.soma(5.5, 3.2));
        System.out.println();

        // Testando subtração
        System.out.println("Subtração int: 10 - 4 = " + calc.subtrai(10, 4));
        System.out.println("Subtração double: 10.5 - 4.3 = " + calc.subtrai(10.5, 4.3));
        System.out.println();


        // Testando multiplicação
        System.out.println("Multiplicação int: 7 * 6 = " + calc.multiplica(7, 6));
        System.out.println("Multiplicação double: 7.2 * 6.5 = " + calc.multiplica(7.2, 6.5));
        System.out.println();


        // Testando divisão
        System.out.println("Divisão int: 20 / 4 = " + calc.divide(20, 4));
        System.out.println();

       
        System.out.println("Divisão int com zero: 20 / 0 = " + calc.divide(20, 0));
        System.out.println();

        System.out.println("Divisão double: 22.5 / 4.5 = " + calc.divide(22.5, 4.5));
        System.out.println("Divisão double com zero: 22.5 / 0.0 = " + calc.divide(22.5, 0.0));
    }
}
