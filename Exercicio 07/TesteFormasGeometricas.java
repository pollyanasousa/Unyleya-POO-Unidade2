// Classe para testar as formas geométricas
public class TesteFormasGeometricas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 7.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Círculo:");
        circulo.imprimirResultados();

        System.out.println("\nRetângulo:");
        retangulo.imprimirResultados();

        System.out.println("\nTriângulo:");
        triangulo.imprimirResultados();
    }
}