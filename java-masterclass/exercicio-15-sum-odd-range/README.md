

# Exercício: Soma de Números Ímpares em um Intervalo

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie dois métodos:

### `isOdd(int number)`
- **Retorna** `true` se o número for ímpar e positivo.
- **Retorna** `false` se o número for negativo ou par.

### `sumOdd(int start, int end)`
- **Parâmetros:** dois inteiros `start` e `end`.
- **Retorna:** a soma de todos os números ímpares no intervalo de `start` até `end` (inclusive).
- **Validações:**
    - Ambos os valores devem ser positivos.
    - `end` deve ser maior ou igual a `start`.
    - Se qualquer validação falhar, retorna `-1`.
- **Implementação:** utiliza um `for` para percorrer o intervalo e chama `isOdd()` para verificar os números ímpares.

## Código

### SumOddRange.java
```java
public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sumOdd = 0;

        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOdd += i;
            }
        }

        return sumOdd;
    }
}
```

### MainExerc15.java
```java
public class MainExerc15 {

    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100));   // Esperado: soma dos ímpares de 1 a 100
        System.out.println(SumOddRange.sumOdd(-1, 100));  // Esperado: -1 (entrada inválida)
        System.out.println(SumOddRange.sumOdd(100, 100)); // Se for ímpar: valor próprio; se par: 0
        System.out.println(SumOddRange.sumOdd(13, 13));   // Esperado: 13
        System.out.println(SumOddRange.sumOdd(100, -100));// Esperado: -1 (entrada inválida)
        System.out.println(SumOddRange.sumOdd(100, 1000));// Esperado: soma dos ímpares de 100 a 1000
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc15`.
3. Os resultados serão exibidos no console.

---
