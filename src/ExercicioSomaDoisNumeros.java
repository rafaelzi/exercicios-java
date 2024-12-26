import java.util.Scanner;

public class ExercicioSomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite os dois números que serão somados");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("A soma é: " + (num1 + num2));
    }
}
