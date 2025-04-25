# Exercício: Point Class and Distance Calculation

## Descrição

Este exercício consiste em criar uma classe `Point` que representa um ponto no espaço bidimensional (2D), com métodos para calcular a distância entre pontos utilizando a fórmula da distância euclidiana.

## Código

### Point.java

```java
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point a) {
        return distance(a.x, a.y);
    }

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }
}
```

### MainExerc33.java

```java
public class MainExerc33 {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
```

## Instruções para Execução

1. Salve os arquivos `Point.java` e `MainExerc33.java`.
2. Compile com:
   ```
   javac Point.java MainExerc33.java
   ```
3. Execute com:
   ```
   java MainExerc33
   ```
4. Os resultados impressos no console representarão as distâncias calculadas entre os pontos especificados.