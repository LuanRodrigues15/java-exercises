# Exercício: Conversor de Velocidade

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie métodos para converter velocidade de **quilômetros por hora (km/h)** para **milhas por hora (mi/h)**:

- `toMilesPerHour(double kilometerPerHour)`: retorna o valor convertido em mi/h (arredondado), ou -1 se o valor for negativo.
- `printConversion(double kilometerPerHour)`: exibe no formato `X km/h = Y mi/h`, ou "Invalid Value" se o valor for negativo.

## Código

### SpeedConverter.java
```java
public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + "km/h = " + milesPerHour + " mi/h");
    }
}
```

### MainExerc02.java
```java
public class MainExerc02 {
    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc02`.
3. Veja a conversão de km/h para mi/h no console.
