# Exercício: Verificação de Dígito Compartilhado Entre Dois Números

Exercício do curso **Java Masterclass 2025** — Udemy.

## Descrição

Crie um método:

### `hasSharedDigit(int num1, int num2)`
- **Parâmetros:** dois inteiros `num1` e `num2` (de 10 a 99, inclusive).
- **Retorna:** `true` se algum dígito de `num1` aparece em `num2`, e `false` caso contrário.
- **Validações:**
    - Ambos os números devem estar entre 10 e 99, inclusive.
    - Se algum número não estiver nesse intervalo, retorna `false`.

## Código

### SharedDigit.java
```java
public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean sharedDigit = false;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (true) {
            if ((num1 % 10) == (num2 % 10) || (num1 % 10) == (num2 /= 10) || (num1 /= 10) == (num2 % 10)) {
                sharedDigit = true;
                break;
            } else {
                sharedDigit = false;
                break;
            }

        }

        return sharedDigit;
    }
}
```

### MainExerc19.java
```java
public class MainExerc19 {

    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12, 23));  // Esperado: true
        System.out.println(SharedDigit.hasSharedDigit(9, 99));   // Esperado: false
        System.out.println(SharedDigit.hasSharedDigit(15, 55));  // Esperado: true
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc19`.
3. Os resultados serão exibidos no console.

---