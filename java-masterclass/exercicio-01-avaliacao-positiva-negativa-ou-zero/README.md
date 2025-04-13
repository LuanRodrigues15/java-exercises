
# Exercício: Avaliação Positivo, Negativo ou Zero

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método `checkNumber` que recebe um número inteiro e imprime:
- **"Positivo"** se for maior que 0.
- **"Negativo"** se for menor que 0.
- **"Zero"** se for igual a 0.

## Código

### PositiveNegativeZero.java
```java
public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        System.out.println("The number is");
        System.out.println((number > 0 ? "positive" : number < 0 ? "negative" : "zero"));
    }
}
```

### MainExerc01.java
```java
import java.util.Scanner;

public class MainExerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        PositiveNegativeZero.checkNumber(sc.nextInt());
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `Main`.
3. Digite um número para ver o resultado.
