# Exercício: Confirmando Números Perfeitos Através da Soma dos Divisores Próprios

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método chamado `isPerfectNumber` que:

- **Parâmetro:** um inteiro `number`.
- **Comportamento:**
    - Se o número for menor que 1, o método deve retornar `false`.
    - O método deve verificar se o número é perfeito. Um número é perfeito se ele for igual à soma de seus divisores próprios positivos (excluindo ele mesmo).

### Exemplos:
- O número 6 é perfeito, pois seus divisores próprios são 1, 2 e 3, e a soma de 1 + 2 + 3 é igual a 6.
- O número 28 é perfeito, pois seus divisores próprios são 1, 2, 4, 7 e 14, e a soma de 1 + 2 + 4 + 7 + 14 é igual a 28.

## Código

### PerfectNumber.java
```java
public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sumDivisor = 0;

        for (int i = 1; i < num; i++) {

            if ((num % i) == 0) {
                sumDivisor += i;
            }
        }

        return (sumDivisor == num);
    }
}
```

### MainExerc23.java
```java
public class MainExerc23 {

    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(6));   // Esperado: true
        System.out.println(PerfectNumber.isPerfectNumber(28));  // Esperado: true
        System.out.println(PerfectNumber.isPerfectNumber(5));   // Esperado: false
        System.out.println(PerfectNumber.isPerfectNumber(-1));  // Esperado: false
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc23`.
3. Os resultados serão exibidos no console.

---