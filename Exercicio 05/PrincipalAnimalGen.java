// Classe principal para testar os sons dos animais
public class PrincipalAnimalGen {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Rex", 5, true);
        Ave ave = new Ave("Canário", 2, true);
        Peixe peixe = new Peixe("Corvina", 1, "Salgada");

        // Mostra o som que cada animal emite
        System.out.print(mamifero.getNome() + ": ");
        mamifero.emitirSom();

        System.out.print(ave.getNome() + ": ");
        ave.emitirSom();

        System.out.print(peixe.getNome() + ": ");
        peixe.emitirSom();
    }
}