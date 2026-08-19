public class Personagem {


        String nome;
        int nivel;
        int vida;
        int forca;
        
        void exibirStatus() {
             System.out.println("Nome: " + nome);
             System.out.println("Nível: " + nivel);
             System.out.println("Vida: " + vida);
             System.out.println("Força: " + forca);
        }

        void atacar (Personagem alvo) {
            System.out.println(nome + "atacou" + alvo.nome);
            alvo.vida = alvo.vida - forca;
        }

        void apresentar() {
            System.out.println(nome )
        }
}