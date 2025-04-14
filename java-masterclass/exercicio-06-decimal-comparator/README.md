
# Exercício: Comparador de Decimais

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para comparar dois números decimais:

- `areEqualByThreeDecimalPlaces(double number1, double number2)`:
    - Retorna `true` se os dois números forem iguais até a terceira casa decimal, caso contrário, retorna `false`.

## Código

### DecimalComparator.java
```java
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        int intNumber1 = (int) (number1 * 1000);
        int intNumber2 = (int) (number2 * 1000);

        return (intNumber1 == intNumber2);
    }
}
```

### MainExerc06.java
```java
public class MainExerc06 {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc06`.
3. Veja as respostas no console.

---