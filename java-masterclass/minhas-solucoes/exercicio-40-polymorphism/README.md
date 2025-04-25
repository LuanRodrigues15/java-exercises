# Polymorphism

## Descrição

Este exercício demonstra o uso de polimorfismo em Java através de uma hierarquia de classes de veículos. A classe base `Car` define o comportamento comum entre os veículos, e três subclasses (`Mitsubishi`, `Holden` e `Ford`) herdam e podem sobrescrever esse comportamento.

## Código

### Car.java

```java
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        String type = getClass().getSimpleName();
        return type + " -> startEngine()";
    }

    public String accelerate() {
        String type = getClass().getSimpleName();
        return type + " -> accelerate()";
    }

    public String brake() {
        String type = getClass().getSimpleName();
        return type + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
```

### Mitsubishi.java

```java
public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
```

### Holden.java

```java
public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
```

### Ford.java

```java
public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
```

### MainExerc40.java

```java
public class MainExerc40 {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
```

## Como Executar

1. Compile todos os arquivos `.java`.
2. Execute a classe `MainExerc40`.
3. Observe a saída que demonstra o comportamento polimórfico dos métodos `startEngine`, `accelerate` e `brake`, de acordo com a classe de cada carro.