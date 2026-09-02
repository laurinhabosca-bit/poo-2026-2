package aula04;

public class Main {
    public static void main(String[] args ) {

        Personagem guerreiro = new Personagem("Arthur", 100, 100, 30, 20);
        Personagem troll = new Personagem("Troll da montanha", 120, 120, 15, 10);

        Arma espada = new Arma("Espada Excalibur", 20);

        System.out.println("Antes");
        guerreiro.exibirStatus();

         guerreiro.exibirStatus();

         guerreiro.atacar(troll);
         troll.curar(25);

         troll.curar(999);

         guerreiro.exibirStatus();
         troll.exibirStatus();



    }
    
}