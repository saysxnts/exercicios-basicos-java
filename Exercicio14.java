import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos dias alugados? ");
        int dias = scanner.nextInt();
        System.out.print("Quantos Km rodados? ");
        double km = scanner.nextDouble();
        double precoTotal = (dias * 90) + (km * 0.20);
        System.out.printf("O total a pagar é de R$%.2f.%n", precoTotal);
        scanner.close();
    }
}