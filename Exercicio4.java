import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " + soma + ".");
        scanner.close();
    }
}