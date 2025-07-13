// Superclasse que representa um animal genérico
public class Animal {
    // Atributos comuns a todos os animais
    protected String nome;
    protected int idade;

    // Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    // Método emitirSom com implementação padrão para exercicio 08
    public void emitirSom() {
        System.out.println("Animal fazendo som genérico...");
    }
}