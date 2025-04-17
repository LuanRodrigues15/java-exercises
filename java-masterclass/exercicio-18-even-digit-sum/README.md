# Exercício: Soma dos Dígitos Pares

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método:

### `getEvenDigitSum(int number)`
- **Parâmetro:** `number` (inteiro).
- **Retorna:** a soma de todos os dígitos pares de `number`.
- **Validações:**
    - Se o número for negativo, retorna `-1`.
- **Implementação:**
    - Usa um `while` para percorrer cada dígito do número.
    - Verifica se o dígito é par usando `digit % 2 == 0`.
    - Soma os dígitos pares e retorna o resultado.

## Código

### EvenDigitSum.java
```java
public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int digits = 0;
        int evenNumber = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            digits = number % 10;
            if (digits % 2 == 0) {
                evenNumber += digits;
            }
            number /= 10;
        }

        return evenNumber;
    }
}
```

### MainExerc18.java
```java
public class MainExerc18 {

    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));  // Esperado: 20
        System.out.println(EvenDigitSum.getEvenDigitSum(252));        // Esperado: 4
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));        // Esperado: -1
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc18`.
3. Os resultados serão exibidos no console.

---