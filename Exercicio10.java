import java.util.Scanner;
import java.util.Locale;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Largura da parede (m): ");
        double largura = scanner.nextDouble();
        System.out.print("Altura da parede (m): ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        double tinta = area / 2;
        System.out.println("Sua parede tem a dimensão de " + largura + "x" + altura + " e sua área é de " + area + "m².");
        System.out.println("Para pintar essa parede, você precisará de " + tinta + "l de tinta.");
        scanner.close();
    }
}