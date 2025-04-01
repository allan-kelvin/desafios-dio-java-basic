// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úceis com prefixo "next";
// - System.out.println: imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldo = scanner.nextDouble();
        
        // Entrada das três transações
        for (int i = 0; i < 3; i++) {
            double transacao = scanner.nextDouble();
            saldo += transacao; // Soma se for positivo, subtrai se for negativo
        }
        
        // Saída do saldo final formatado com duas casas decimais
        System.out.printf("%.2f\n", saldo);

        scanner.close();
    }
}