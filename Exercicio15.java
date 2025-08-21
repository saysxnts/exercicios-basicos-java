import java.util.Scanner;
import java.util.Locale;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos dias trabalhados no mês? ");
        int diasTrabalhados = scanner.nextInt();
        double salario = diasTrabalhados * 8 * 25;
        System.out.printf("O salário do funcionário neste mês será de R$%.2f.%n", salario);
        scanner.close();
    }
}