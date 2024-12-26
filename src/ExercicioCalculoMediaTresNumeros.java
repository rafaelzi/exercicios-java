import java.util.Scanner;

public class ExercicioCalculoMediaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2, num3;

        System.out.println("Digite os três números os quais serão calculados a média aritmética");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        num3 = scanner.nextFloat();

        float mediaNumeros = (num1 + num2 + num3) / 3;
        System.out.println("A média dos números é: " + String.format("%.1f", mediaNumeros));
    }
}
