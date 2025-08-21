import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o preço do produto? R$");
        double preco = scanner.nextDouble();
        double novoPreco = preco * 0.95; // ou preco - (preco * 5 / 100)
        System.out.printf("O produto que custava R$%.2f, na promoção com 5%% de desconto vai custar R$%.2f.%n", preco, novoPreco);
        scanner.close();
    }
}