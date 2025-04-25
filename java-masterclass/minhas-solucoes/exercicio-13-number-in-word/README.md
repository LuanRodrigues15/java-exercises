

# Exercício: Programa 'Número por Extenso'

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para exibir o nome em inglês de números inteiros de 0 a 9:

- `printNumberInWord(int number)`:
    - Se o número for `0` a `9`, imprime o nome correspondente em inglês.
    - Para qualquer outro valor (inclusive negativos), imprime `OTHER`.
    - Pode ser implementado com `switch` ou `if-else`.

## Código

### NumberInWord.java
```java
public class NumberInWord {

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
}
```

### MainExerc13.java
```java
import java.util.Scanner;

public class MainExerc13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.println("Digite um número de 0-9 para ver seu nome em inglês ou digite -1 para sair");
                System.out.print("Digite: ");
                number = Integer.parseInt(sc.nextLine());

                if (number == -1) {
                    System.out.println("Sistema finalizado.");
                    break;
                } else {
                    NumberInWord.printNumberInWord(number);
                }

            } catch (NumberFormatException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc13`.
3. Digite um número de 0 a 9 para ver a palavra correspondente ou `-1` para sair.

---