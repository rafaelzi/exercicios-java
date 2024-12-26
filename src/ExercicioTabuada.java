import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para mostrar sua tabuada: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
