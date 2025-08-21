import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.Month;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        Month mesAtual = LocalDate.now().getMonth();
        String nomeMes = mesAtual.getDisplayName(java.time.format.TextStyle.FULL, new Locale("pt", "BR"));

        System.out.printf("O funcionário %s tem um salário de R$%.2f em %s.%n", nome, salario, nomeMes);
        scanner.close();
    }
}