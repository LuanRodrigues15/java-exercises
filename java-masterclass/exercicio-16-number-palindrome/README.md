# Exercício: Verificação de Número Palíndromo

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método:

### `isPalindrome(int number)`
- **Parâmetro:** `number` (inteiro).
- **Retorna:** `true` se o número for um palíndromo, `false` caso contrário.
- **Definição:** Um número é palíndromo se for igual a ele mesmo quando seus dígitos são invertidos (ex.: `121`, `-1221`, `707`).
- **Implementação:**
    - Converte o número para positivo.
    - Inverte os dígitos usando um `while`.
    - Compara o valor invertido com o valor absoluto do número original.

## Código

### NumberPalindrome.java
```java
public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        number = Math.abs(number);

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse == Math.abs(original);
    }
}
```

### MainExerc16.java
```java
public class MainExerc16 {

    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(-10));    // Esperado: false
        System.out.println(NumberPalindrome.isPalindrome(-1221));  // Esperado: true
        System.out.println(NumberPalindrome.isPalindrome(707));    // Esperado: true
        System.out.println(NumberPalindrome.isPalindrome(11212));  // Esperado: false
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc16`.
3. Os resultados serão exibidos no console.

---