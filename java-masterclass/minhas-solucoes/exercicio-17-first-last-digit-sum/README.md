# Exercício: Soma do Primeiro e Último Dígito

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método:

### `sumFirstAndLastDigit(int number)`
- **Parâmetro:** `number` (inteiro).
- **Retorna:** a soma do primeiro e do último dígito de `number`.
- **Validações:**
    - Se o número for negativo, retorna `-1`.
- **Implementação:**
    - Obtém o último dígito com `number % 10`.
    - Encontra o primeiro dígito dividindo sucessivamente `number` por `10` até que ele seja menor que `10`.
    - Retorna a soma dos dois.

## Código

### FirstLastDigitSum.java
```java
public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = 0;

        if (number < 0) {
            return -1;
        }

        last = number % 10;

        while (number >= 0) {
            if (number <= 9) {
                first = number;
                break;
            }
            number /= 10;
        }

        return (first + last);
    }
}
```

### MainExerc17.java
```java
public class MainExerc17 {

    public static void main(String[] args) {
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));   // Esperado: 4
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));   // Esperado: 9
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));     // Esperado: 0
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));     // Esperado: 10
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));   // Esperado: -1
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc17`.
3. Os resultados serão exibidos no console.

---