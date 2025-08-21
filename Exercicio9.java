import java.util.Scanner;
import java.util.Locale;

public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double cotacaoDolar = 5.15;
        System.out.print("Quanto dinheiro você tem na carteira? R$");
        double reais = scanner.nextDouble();
        double dolares = reais / cotacaoDolar;
        System.out.printf("Com R$%.2f você pode comprar US$%.2f.%n", reais, dolares);
        scanner.close();
    }
}