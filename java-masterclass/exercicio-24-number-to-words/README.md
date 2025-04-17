# Exercício: Convertendo Dígitos em Palavras e Lidando com Casos Especiais

Este exercício envolve a conversão de números inteiros para palavras. Além disso, requer a manipulação de números negativos e a consideração de zeros à esquerda. O exercício é dividido em três métodos que ajudam a resolver o problema de forma eficiente.

## Descrição dos Métodos

### 1. Método `reverse(int number)`
Esse método recebe um número inteiro e retorna o número invertido. Caso o número seja negativo, o sinal é preservado.

### 2. Método `getDigitCount(int number)`
Esse método recebe um número inteiro e retorna o número de dígitos que ele possui. Se o número for negativo, retorna `-1` como valor inválido.

### 3. Método `numberToWords(int number)`
Esse método recebe um número e imprime seus dígitos em palavras. Se o número for negativo, imprime `"Invalid Value"`. Caso o número tenha zeros à esquerda quando invertido, esses zeros são considerados.

## Código

### NumberToWords.java

```java
public class NumberToWords {

    // Método para inverter o número
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    // Método para contar os dígitos
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    // Método para imprimir o número em palavras
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(number);

        // Contagem de zeros à esquerda
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        // Convertendo o número invertido em palavras
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        // Imprimindo os zeros à esquerda
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }
}
```

### MainExerc24.java

```java
public class MainExerc24 {

    public static void main(String[] args) {
        // Testando o método getDigitCount
        System.out.println(NumberToWords.getDigitCount(0));   // Esperado: 1
        System.out.println(NumberToWords.getDigitCount(123)); // Esperado: 3
        System.out.println(NumberToWords.getDigitCount(-12)); // Esperado: -1
        System.out.println(NumberToWords.getDigitCount(5200));// Esperado: 4

        System.out.println();

        // Testando o método reverse
        System.out.println(NumberToWords.reverse(-121));  // Esperado: -121
        System.out.println(NumberToWords.reverse(1212));  // Esperado: 2121
        System.out.println(NumberToWords.reverse(1234));  // Esperado: 4321
        System.out.println(NumberToWords.reverse(100));   // Esperado: 1

        System.out.println();

        // Testando o método numberToWords
        NumberToWords.numberToWords(123);   // Esperado: "One", "Two", "Three"
        System.out.println();
        NumberToWords.numberToWords(1010);  // Esperado: "One", "Zero", "One", "Zero"
        System.out.println();
        NumberToWords.numberToWords(1000);  // Esperado: "One", "Zero", "Zero", "Zero"
        System.out.println();
        NumberToWords.numberToWords(-12);   // Esperado: "Invalid Value"
    }
}
```

## Como Funciona

1. **`reverse(int number)`**: Este método inverte o número, permitindo que os dígitos sejam processados da maneira correta.
2. **`getDigitCount(int number)`**: Conta os dígitos do número, que é útil para verificar os zeros à esquerda no número invertido.
3. **`numberToWords(int number)`**: Este é o método principal, que imprime o número como palavras. Ele usa os dois métodos anteriores para garantir que os números negativos sejam tratados adequadamente, os zeros à esquerda sejam considerados e os números sejam invertidos e apresentados corretamente.

### Testes

Ao rodar o código, o seguinte será impresso:

```
1
3
-1
4

-121
2121
4321
1

One
Two
Three

One
Zero
One
Zero

One
Zero
Zero
Zero

Invalid Value
```

Isso demonstra o funcionamento adequado de todos os métodos, tratando tanto casos negativos quanto zeros à esquerda.