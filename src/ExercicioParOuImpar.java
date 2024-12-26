import java.util.Scanner;

public class ExercicioParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para verificar a paridade: ");
        int num = scanner.nextInt();
        String paridade;

        if (num % 2 == 0){
            paridade = "par";
        } else {
            paridade = "ímpar";
        }

        System.out.println("O número digitado é " + paridade);
    }
}
