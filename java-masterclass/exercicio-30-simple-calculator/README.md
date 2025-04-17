# Exercício: Sum Calculator Implementation

## Descrição

Este exercício implementa uma calculadora simples com duas variáveis do tipo `double`, chamadas `firstNumber` e `secondNumber`. A classe oferece métodos para definir e obter esses valores, além de calcular:
- Soma
- Subtração
- Multiplicação
- Divisão (retornando 0 se o divisor for zero)

## Código

### SimpleCalculator.java

```java
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0;
        }
        return firstNumber / secondNumber;
    }
}
```

### MainExerc30.java

```java
public class MainExerc30 {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
```

## Instruções para Execução

1. Certifique-se de ter o Java instalado e configurado no ambiente.
2. Salve os códigos acima em arquivos chamados `SimpleCalculator.java` e `MainExerc30.java`.
3. Compile ambos:
   ```
   javac SimpleCalculator.java MainExerc30.java
   ```
4. Execute:
   ```
   java MainExerc30
   ```
5. Observe o resultado no console.