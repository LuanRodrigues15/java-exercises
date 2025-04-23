# Exercício: Wall Area Computation

## Descrição

Este exercício consiste em criar uma classe `Wall` que representa uma parede com largura e altura. A classe deve permitir o cálculo da área da parede e tratar valores negativos adequadamente.

## Código

### Wall.java

```java
public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return (width * height);
    }

    public double getWidth() {
        return width;
    }

    public Wall setWidth(double width) {
        this.width = width < 0 ? 0 : width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Wall setHeight(double height) {
        this.height = height < 0 ? 0 : height;
        return this;
    }
}
```

### MainExerc32.java

```java
public class MainExerc32 {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
```

## Instruções para Execução

1. Salve os arquivos `Wall.java` e `MainExerc32.java`.
2. Compile com:
   ```
   javac Wall.java MainExerc32.java
   ```
3. Execute com:
   ```
   java MainExerc32
   ```
4. Verifique os resultados do cálculo da área e o tratamento de valores negativos.