// Superclasse que representa um veículo genérico
public class Veiculo {
    // Atributos comuns a todos os veículos
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Veiculo para inicializar os atributos
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters para acessar os atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Métodos setters para modificar os atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
     public void acelerar() {
        System.out.println(getModelo() + " acelerando...");
     }  
     
    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }    
}
