# Exercício: Carpet Cost Calculator Class

Este exercício envolve criar uma aplicação para calcular o custo do carpete para cobrir um piso retangular. Vamos criar três classes para representar o piso, o carpete e o cálculo do custo total.

## Classes

### 1. **Floor Class**

A classe `Floor` representa o piso. Ela contém as variáveis `width` (largura) e `length` (comprimento), e calcula a área do piso.

```java
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    public double getArea() {
        return (width * length);
    }
}
```

### 2. **Carpet Class**

A classe `Carpet` representa o carpete. Ela contém a variável `cost` (custo por metro quadrado) e fornece o valor de custo.

```java
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost > 0 ? cost : 0;
    }

    public double getCost() {
        return cost;
    }
}
```

### 3. **Calculator Class**

A classe `Calculator` é responsável por calcular o custo total para cobrir o piso com o carpete. Ela recebe um objeto `Floor` e um objeto `Carpet`, e calcula o custo total multiplicando a área do piso pelo custo do carpete.

```java
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
```

### 4. **MainExerc34 Class**

A classe `MainExerc34` é a classe principal que testa as outras classes, criando objetos de `Carpet`, `Floor` e `Calculator`, e imprimindo o custo total.

```java
public class MainExerc34 {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5); // Custo por metro quadrado
        Floor floor = new Floor(2.75, 4.0); // Largura e comprimento do piso
        Calculator calculator = new Calculator(floor, carpet); // Calculador
        System.out.println("total= " + calculator.getTotalCost()); // Cálculo do custo total

        carpet = new Carpet(1.5); // Novo custo do carpete
        floor = new Floor(5.4, 4.5); // Novo piso
        calculator = new Calculator(floor, carpet); // Novo cálculo
        System.out.println("total= " + calculator.getTotalCost()); // Cálculo do custo total
    }
}
```

## Execução

Para compilar e executar:

1. Salve os arquivos `Floor.java`, `Carpet.java`, `Calculator.java` e `MainExerc34.java`.
2. Compile os arquivos com:
   ```
   javac Floor.java Carpet.java Calculator.java MainExerc34.java
   ```
3. Execute a aplicação com:
   ```
   java MainExerc34
   ```

A saída esperada será algo como:

```
total= 38.5
total= 36.45
```

Onde o primeiro cálculo usa um carpete que custa \$3.5 por metro quadrado e o segundo usa um carpete que custa \$1.5 por metro quadrado.