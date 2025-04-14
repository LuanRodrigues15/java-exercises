

# Exercício: Calculadora de Minutos para Anos e Dias

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para calcular anos e dias a partir de um valor em minutos:

- `printYearsAndDays(long minutes)`:
    - Calcula os anos e dias com base nos minutos fornecidos.
    - Se os minutos forem negativos, imprime "Invalid Value".
    - Caso contrário, imprime no formato: `XX min = YY y and ZZ d`.

## Código

### MinutesToYearsDaysCalculator.java
```java
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        day %= 365;

        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}
```

### MainExerc10.java
```java
public class MainExerc10 {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc10`.
3. Veja as respostas no console.

---