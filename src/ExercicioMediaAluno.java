import java.util.Scanner;

public class ExercicioMediaAluno {

    public static void validarMedia(float media) {
        if (media >= 6) {
            System.out.println("Aluno aprovado");
        } else if (media >= 4) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    public static void main(String[] args) {
        //TODO: Elabore um algoritmo que valide a media de um aluno. Se a media for maior ou igual a 6, o aluno esta aprovado.
        // Se a media for maior que 4 ou menor igual a 5 ele esta em recuperacao senao ele esta reprovado

        Scanner scanner = new Scanner(System.in);
        float media;

        System.out.print("Digite a média do aluno: ");
        media = scanner.nextFloat();

        validarMedia(media);
    }
}
