// Subclasse Peixe com característica específica: tipo de água
class Peixe extends Animal {
    private String tipoAgua; // Pode ser "doce" ou "salgada"

    // Construtor da subclasse Peixe
    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, idade);
        this.tipoAgua = tipoAgua;
    }

    // Métodos de acesso (getters)
    public String getTipoAgua() {
        return tipoAgua;
    }

    public void nadar() {
        System.out.println(nome + " está nadando");
    }

    // Método sobrescrito para exercicio 08
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Blub Blub!");
    }

}