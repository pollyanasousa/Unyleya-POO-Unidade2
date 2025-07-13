// Classe principal que testa as subclasses
class PrincipalAnimal {
    public static void main(String[] args) {
        System.out.println("=== CATÁLOGO DE ANIMAIS ===\n");
        Mamifero mamifero = new Mamifero("Cachorro", 5, true);
        Ave ave = new Ave("Papagaio", 2, true);
        Peixe peixe = new Peixe("Peixe Dourado", 1, "Doce");

        System.out.println("=== Mamífero ===");
        mamifero.dormir();
        mamifero.amamentar();

        System.out.println("\n=== Ave ===");
        ave.dormir();
        ave.voar();        

        System.out.println("\n=== Peixe ===");
        peixe.dormir(); 
        peixe.nadar();        
    }
}
