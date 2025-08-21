import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equação do 2º grau: ax² + bx + c = 0");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        double delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta (Δ) é " + delta);
        scanner.close();
    }
}