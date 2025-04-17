# Exercício: Listando Todos os Fatores de um Número Dado

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método chamado `printFactors` que:

- **Parâmetro:** um número inteiro `number`.
- **Comportamento:**
    - Se o número for menor que 1, imprima "Invalid Value".
    - Caso contrário, imprima todos os fatores do número. Um fator de um número é um inteiro que divide esse número sem deixar resto (ou seja, `number % i == 0`).

## Código

### FactorPrinter.java
```java
public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
```

### MainExerc21.java
```java
public class MainExerc21 {

    public static void main(String[] args) {
        FactorPrinter.printFactors(6);  // Esperado: 1, 2, 3, 6
        FactorPrinter.printFactors(32); // Esperado: 1, 2, 4, 8, 16, 32
        FactorPrinter.printFactors(10); // Esperado: 1, 2, 5, 10
        FactorPrinter.printFactors(-1); // Esperado: Invalid Value
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc21`.
3. Os resultados serão exibidos no console.

---