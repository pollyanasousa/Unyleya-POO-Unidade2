// Subclasse que representa um carro, estendendo a classe Veiculo
public class Carro extends Veiculo {
    // Atributo específico da classe Carro
    private int numeroDePortas;

    // Construtor da classe Carro que utiliza o construtor da superclasse Veiculo
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    // Método getter para o número de portas
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    // Método setter para alterar o número de portas
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void limparParabrisa() {
        System.out.println(getModelo() + " limpando Parabrisa!");
    }    
}
