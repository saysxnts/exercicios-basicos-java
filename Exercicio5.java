import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
        scanner.close();
    }
}