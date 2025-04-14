

# Exercício: Calculadora de Área de Círculos e Retângulos

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie métodos para calcular a área de círculos e retângulos:

- `area(double radius)`:
    - Calcula a área de um círculo com o raio fornecido.
    - Se o raio for negativo, retorna `-1.0` para indicar valor inválido.

- `area(double x, double y)`:
    - Calcula a área de um retângulo com os lados `x` e `y`.
    - Se qualquer um dos lados for negativo, retorna `-1.0` para indicar valor inválido.

## Código

### areaCalculator.java
```java
public class areaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }

        return (x * y);
    }
}
```

### MainExerc09.java
```java
public class MainExerc09 {
    public static void main(String[] args) {
        System.out.println(areaCalculator.area(5.0));
        System.out.println(areaCalculator.area(-1));
        System.out.println(areaCalculator.area(5.0, 4.0));
        System.out.println(areaCalculator.area(-1.0, 4.0));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc09`.
3. Veja as respostas no console.

---