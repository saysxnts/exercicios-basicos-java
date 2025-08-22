import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();
        System.out.print("Há quantos anos você fuma? ");
        int anosFumando = scanner.nextInt();

        int totalCigarros = cigarrosPorDia * anosFumando * 365;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / (24 * 60); 
    

        System.out.println("Você perderá aproximadamente " + diasPerdidos + " dias de vida.");
        scanner.close();
    }
}
