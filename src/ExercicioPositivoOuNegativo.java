import java.util.Scanner;

public class ExercicioPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para verificar o sinal: ");
        float num = scanner.nextFloat();
        String sinal;

        if (num == 0){
            sinal = "nulo";
        } else if (num > 0) {
            sinal = "positivo";
        } else {
            sinal = "negativo";
        }

        System.out.println("O número digitado é " + sinal);
    }
}
