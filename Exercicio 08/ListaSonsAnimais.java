import java.util.ArrayList;
import java.util.List;

public class ListaSonsAnimais {
    public static void main(String[] args) {
        // Criando lista de animais
        List<Animal> animais = new ArrayList<>();

        // Instanciando diferentes tipos de animais (subclasses), usando os animais que já existem
        animais.add(new Mamifero("Cachorro", 5, true)); // Um mamífero com pelos
        animais.add(new Ave("Papagaio", 2, true));  // Uma ave que sabe voar
        animais.add(new Peixe("Peixe Dourado", 1, "Doce")); // Um peixe de água doce
        
       // Sinfonia de sons - Percorrendo a lista
        System.out.println("=== SINFONIA DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom();
            System.out.println();
        }

        System.out.println("=== Fim da sinfonia! ===");
        
    }
}
