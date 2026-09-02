package aula04;

public class Personagem {

    private String nome;
    private int vida;
    private int vidaMaxima;
    private int forca;
    private int nivel;

    private Arma arma;

    Personagem ( String nome, int vida, int vidaMaxima, int forca, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.forca = forca;
        this.nivel = nivel;
    }

    public boolean estaVivo() {
    return vida > 0;
}

public String getNome() {
    return nome;
}

    void exibirStatus() {
        System.out.println( nome + ", sua vida: " + vida);
    }

    public void equipar(Arma novaArma) {
        if ( novaArma == null) {
            System.out.println(nome + " tentou equipar uma arma que não existe");
        }
        
        arma = novaArma;
         System.out.println(nome + " Equipou " + arma.getNome() + ".");
    }

    public void atacar(Personagem alvo) {
        if ( alvo == null){
            System.out.println(nome + " tentou atacar alguém que não existe");
            return;
        }
        int danoTotal = forca;

        if (arma != null) {
            danoTotal = arma.getDano();
        }

        System.out.println( nome + " Atacou " + alvo.getNome() + "");
        alvo.receberDano(danoTotal);
    }

    private void receberDano (int dano) {
        vida -= dano;
        
        if (vida < 0) {
            vida = 0;
        }

        if (!estaVivo()) {
            System.out.println(nome + "Foi derrotado." );
            return;
        }
    }

    public void curar( int quantidade) {
        if (!estaVivo()) {
            System.out.println( nome + " esta derrotado, e não pode se curar");
            return;
        }

        int vidaAntes = vida;
        vida += quantidade;

        if ( vida > vidaMaxima) {
            vida = vidaMaxima;
        }

        int curaReal = vida - vidaAntes;

        System.out.println(nome + " curou " + curaReal);
    }

    
}
