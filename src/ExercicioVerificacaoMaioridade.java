public class ExercicioVerificacaoMaioridade {
    public static void main(String[] args) {
        String nome = "Rafael";
        int idade = 18;

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);

        if (idade >= 18) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}