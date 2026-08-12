package aula01;

public class FichaPessoal {

    public static void main(String[] args) {
    
        System.out.println("Nome: Laura");
        System.out.println("Idade: 16 anos");
        System.out.println("Cidade: Joinville");
        
        String nome = "Laura";
        int idade = 16;
        String cidade = "Joinville";
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cidade);

        int anoNascimento = 2010;
        int anoAtual = 2026;
        int idadeCauculada = anoAtual - anoNascimento;
         System.out.println(idadeCauculada);
    }
}
