// Superclasse FormaGeometrica: base para formas geométricas
public class FormaGeometrica {
    // Método para calcular área (na superclasse retorna 0 por padrão)
    public double calcularArea() {
        return 0;
    }

    // Método para calcular perímetro (na superclasse retorna 0 por padrão)
    public double calcularPerimetro() {
        return 0;
    }

    // Método para imprimir resultados da forma geométrica
    public void imprimirResultados() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
