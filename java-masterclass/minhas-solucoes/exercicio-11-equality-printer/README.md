

# Exercício: Impressora de Igualdade de Números

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar igualdade ou diferença entre três números inteiros:

- `printEqual(int num1, int num2, int num3)`:
    - Se algum número for menor que 0, imprime **"Invalid Value"**.
    - Se todos os números forem iguais, imprime **"All numbers are equal"**.
    - Se todos forem diferentes, imprime **"All numbers are different"**.
    - Caso contrário, imprime **"Neither all are equal or different"**.

## Código

### IntEqualityPrinter.java
```java
public class IntEqualityPrinter {

    public static void printEqual (int num1, int num2, int num3) {

        if((num1 < 0) || (num2 < 0) || (num3 < 0)) {
            System.out.println("Invalid Value");
            return;
        }

        if((num1 == num2) && (num1 == num3)) {
            System.out.println("All numbers are equal");
        } else if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
```

### MainExerc11.java
```java
public class MainExerc11 {

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc11`.
3. Veja as respostas no console.

---