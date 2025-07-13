// Subclasse Ave com característica específica: capacidade de voo
class Ave extends Animal {
    private boolean sabeVoar;

    // Construtor da subclasse Ave
    public Ave(String nome, int idade, boolean sabeVoar) {
        super(nome, idade);
        this.sabeVoar = sabeVoar;
    }

    // Métodos de acesso (getters)
    public boolean SabeVoar() {
        return sabeVoar;
    }
    
    public void voar() {
        if (sabeVoar) {
            System.out.println(nome + " está voando");
        } else {
            System.out.println(nome + " não pode voar");
        }
    }

    // Método sobrescrito para exercicio 08
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Piu Piu!");
    }
}
