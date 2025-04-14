# Desafio Java Básico - Explorando Sintaxe Java

Este repositório contém dois desafios básicos em Java para praticar conceitos fundamentais da linguagem, como entrada e saída de dados, tipos primitivos e estruturas condicionais.

## Desafios

### 1 - Cálculo de Saldo Atual com Tipos Primitivos

Este desafio consiste em calcular o saldo atual de um cliente após três transações (positivas ou negativas) utilizando tipos primitivos em Java.

#### Código:

```java
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
```

### 2 - Classificação de Clientes pelo Saldo

O objetivo deste desafio é classificar um cliente com base no seu saldo bancário.

#### Classificação:
- **Saldo menor que 0**: "Negativado"
- **Saldo entre 0 e 500**: "Baixo"
- **Saldo maior que 500**: "Confortável"

#### Código:

```java
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úceis com prefixo "next";
// - System.out.println: imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        
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
```


```
import java.util.ArrayList;
import java.util.Scanner;

public class InsercaoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

        // TODO: Solicitar ao usuário a inserção de 3 registros iniciais (nome e idade).
       int contador = 0;
        while (contador <3){
          String nome = scanner.nextLine();
          usuarios.add(nome);
          contador ++;
        }
        
        scanner.close();
        
        ArrayList<String> nomes = new ArrayList<>();
        for (String usuario : usuarios) {
            String[] partes = usuario.split(" ");
            nomes.add(partes[0]);
        }
        System.out.println("Banco de dados atualizado: " + String.join(", ", nomes));
       
    }
}
```

## Como Executar os Códigos

1. Instale o Java JDK (Java Development Kit) se ainda não tiver.
2. Copie o código para um arquivo chamado `Main.java`.
3. Compile o arquivo com o comando:
   ```sh
   javac Main.java
   ```
4. Execute o programa:
   ```sh
   java Main
   ```
5. Insira os valores conforme o desafio e visualize a saída.

---

Sinta-se à vontade para contribuir e aprimorar os desafios! 🚀
