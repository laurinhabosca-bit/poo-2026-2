public class Main {

    public static void main(String[] args) {

        Personagem guerreiro = new Personagem();

        guerreiro.nome = "Artur";
        guerreiro.vida = 100;
        guerreiro.forca = 25;
        guerreiro.nivel = 2;

        Personagem monstro = new Personagem();

        monstro.nome = "Goblin";
        monstro.vida = 60;
        monstro.forca = 10;
        monstro.nivel = 1;

        Personagem monstro2 = new Personagem();

        monstro2.nome = "Trol";
        monstro2.vida = 80;
        monstro2.forca = 15;
        monstro2.nivel = 10;

        guerreiro.exibirStatus();
        monstro.exibirStatus();
        monstro2.exibirStatus();

        guerreiro.atacar(Trol);
        alvo.apresentar();

    }
}