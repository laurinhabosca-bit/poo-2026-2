public class Main {
    public static void main(String[] args) {
        
     Atacante primeiro = new Guerreiro("Artur");
     Atacante segundo = new Armadilha("Trap");

     primeiro.atacar();
     segundo.atacar();

     System.out.println("========");
 
     Atacante[] atacantes = {
        new Guerreiro("Golias"),
        new Mago("Gandalf"),
        new Armadilha("Espinhos")
     };

     for (Atacante item : atacantes) {
        item.atacar();
     }


    }
}