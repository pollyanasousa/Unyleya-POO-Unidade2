// Classe principal para testar as classes criadas sem conflito com exercício 1
public class PrincipalVeiculoInfo {
    public static void main(String[] args) {
        // Criando um carro com dados específicos
        Carro carro = new Carro("Volkswagen", "Gol", 2019, 5);

        // Criando uma moto com dados específicos
        Moto moto = new Moto("Yamaha", "YBR FACTOR", 2015, true);

        // Imprimindo as informações detalhadas do carro e moto 
        
        System.out.println("=== Informações do Carro ===");
        carro.exibirDados();
        carro.acelerar();
        carro.limparParabrisa();
        System.out.println();

        System.out.println("=== Informações do Moto ===");
        moto.exibirDados();
        moto.acelerar();
        moto.getTemPartidaEletrica();   
    }
}