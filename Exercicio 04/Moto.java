// Subclasse que representa uma moto, herdando da classe Veiculo
public class Moto extends Veiculo {
    // Atributo específico da Moto: indica se possui partida elétrica
    private boolean temPartidaEletrica;    

    // Construtor da classe Moto que utiliza o construtor da superclasse Veiculo
    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;       
    }

    // Método getter para verificar se a moto tem partida elétrica
    public boolean getTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    // Método setter para definir se a moto tem partida elétrica
    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    // Método específico da classe Moto que retorna o estado da partida elétrica
    public boolean partidaEletrica() {
        return temPartidaEletrica;
    }

    // Método sobrescrito para exibir os dados da moto solicitado exercicio 04
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }    
}
