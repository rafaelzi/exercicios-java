import java.util.Scanner;

public class ExercicioCategoriaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 13) {
            System.out.println("Adolescente");
        } else {
                System.out.println("Infantil");
        }
    }
}
