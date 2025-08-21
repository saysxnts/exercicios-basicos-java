import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();
        System.out.println("\nA distância de " + metros + "m corresponde a:");
        System.out.printf("%.5f Km%n", metros / 1000);
        System.out.printf("%.4f Hm%n", metros / 100);
        System.out.printf("%.3f Dam%n", metros / 10);
        System.out.printf("%.0f dm%n", metros * 10);
        System.out.printf("%.0f cm%n", metros * 100);
        System.out.printf("%.0f mm%n", metros * 1000);
        scanner.close();
    }
}