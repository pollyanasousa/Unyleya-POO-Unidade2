// Subclasse Mamífero com característica específica: possui pelos
class Mamifero extends Animal {
    private boolean temPelos;

    // Construtor da subclasse Mamífero
    public Mamifero(String nome, int idade, boolean temPelos) {
        super(nome, idade);
        this.temPelos = temPelos;
    }

    // Métodos de acesso (getters)
    public boolean getTemPelos() {
        return temPelos;
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando");
    }
    // Método sobrescrito para exercicio 08
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au Au!");
    }
}
