import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else if (saldo > 500) {
            System.out.println("Confortavel");
        } else {
            System.out.println("Não computavel");
        }

        scanner.close();
    }
}