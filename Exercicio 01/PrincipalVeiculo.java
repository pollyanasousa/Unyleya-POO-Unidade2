// Classe Principal responsável por testar o funcionamento do sistema de veículos
public class PrincipalVeiculo {      
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "onix", 2021, 4);
        Moto moto = new Moto("Honda", "CB 160", 2020, true);
        
        System.out.println("=== Dados do Carro ===");
        carro.limparParabrisa();
        carro.acelerar();

        System.out.println("\n=== Dados da Moto ===");
        moto.getTemPartidaEletrica();
        moto.acelerar();
    }    
}
