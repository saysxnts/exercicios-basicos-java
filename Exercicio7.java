import java.util.Scanner;
import java.util.Locale;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        System.out.println("O dobro de " + numero + " é " + (numero * 2));
        System.out.println("A terça parte de " + numero + " é " + (numero / 3));
        scanner.close();
    }
}