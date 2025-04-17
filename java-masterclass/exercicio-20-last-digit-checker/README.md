# Exercício: Avaliação do Último Dígito para Múltiplas Comparações Inteiras

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método:

### `hasSameLastDigit(int num1, int num2, int num3)`
- **Parâmetros:** três inteiros `num1`, `num2` e `num3`.
- **Retorna:** `true` se pelo menos dois dos números compartilharem o mesmo último dígito, e `false` caso contrário.
- **Validações:**
    - Cada número deve estar no intervalo de 10 a 1000 (inclusive).
    - Se algum número não estiver dentro desse intervalo, retorna `false`.

## Código

### LastDigitChecker.java
```java
public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        return ((num1 % 10) == (num2 % 10) || (num2 % 10) == (num3 % 10) || (num3 % 10) == (num1 % 10));
    }

    public static boolean isValid(int num) {
        return ((num >= 10) && (num <= 1000));
    }
}
```

### MainExerc20.java
```java
public class MainExerc20 {

    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71)); // Esperado: true
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42)); // Esperado: true
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999)); // Esperado: false
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc20`.
3. Os resultados serão exibidos no console.

---