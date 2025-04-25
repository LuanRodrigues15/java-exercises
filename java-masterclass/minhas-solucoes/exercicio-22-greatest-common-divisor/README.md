# Exercício: Derivando o Máximo Divisor Comum (MDC) de Forma Eficiente

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método chamado `getGreatestCommonDivisor` que:

- **Parâmetros:** dois inteiros `first` e `second`.
- **Comportamento:**
    - Se um dos parâmetros for menor que 10, o método deve retornar `-1` para indicar valor inválido.
    - Caso contrário, o método deve retornar o maior divisor comum (MDC) entre os dois números.

### Explicação do MDC
O MDC de dois números é o maior número que pode dividir ambos os números sem deixar resto.

Por exemplo:
- O MDC de 12 e 30 é 6, pois 12 pode ser dividido por 1, 2, 3, 4, 6, 12 e 30 pode ser dividido por 1, 2, 3, 5, 6, 10, 15, 30. O maior número comum entre eles é 6.

## Código

### GreatestCommonDivisor.java
```java
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int rest = 0;

        while (second != 0) {
            rest = second;
            second = first % second;
            first = rest;
        }

        return first;
    }
}
```

### MainExerc22.java
```java
public class MainExerc22 {

    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));  // Esperado: 5
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));  // Esperado: 6
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));   // Esperado: 9
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153)); // Esperado: 9
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc22`.
3. Os resultados serão exibidos no console.

---