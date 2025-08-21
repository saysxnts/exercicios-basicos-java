import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o salário do funcionário? R$");
        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.15; // ou salario + (salario * 15 / 100)
        System.out.printf("Um funcionário que ganhava R$%.2f, com 15%% de aumento, passa a receber R$%.2f.%n", salario, novoSalario);
        scanner.close();
    }
}