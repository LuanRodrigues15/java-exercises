# Exercício: Composição de Quarto com Classes para Lampada, Cama e Parede

Neste exercício, exploramos o conceito de **composição de classes** ao modelar um quarto (`Bedroom`) que é composto por outros objetos como `Lamp`, `Bed`, `Wall` e `Ceiling`. O objetivo é entender como objetos podem conter outros objetos como seus atributos, promovendo a reutilização e organização do código.

## Passo 1: Criando a classe `Lamp`

A classe `Lamp` representa uma lâmpada com três atributos: estilo, se usa bateria e sua potência.

```java
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
```

### Explicação do código:
- A lâmpada possui um estilo (`style`), uma indicação se é alimentada por bateria (`battery`) e a potência da lâmpada (`globRating`).
- O método `turnOn()` apenas imprime uma mensagem simulando que a lâmpada foi ligada.

## Passo 2: Criando a classe `Bed`

A classe `Bed` representa uma cama com informações como estilo, número de travesseiros, altura, lençóis e cobertor.

```java
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
```

### Explicação do código:
- A cama é composta por cinco características, como altura e número de itens.
- O método `make()` imprime que a cama está sendo arrumada.

## Passo 3: Criando a classe `Ceiling`

A classe `Ceiling` representa o teto do quarto, com altura e cor.

```java
public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
```

### Explicação do código:
- Define o teto com altura (`height`) e uma cor representada por um número (`paintedColor`).

## Passo 4: Criando a classe `Walls`

A classe `Walls` representa uma parede com uma direção.

```java
public class Walls {
    private String direction;

    public Walls(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
```

### Explicação do código:
- Cada parede tem uma direção como "North", "South", etc.

## Passo 5: Criando a classe `MainExerc38` para testar

A classe `MainExerc38` demonstra a criação de objetos e o uso de seus métodos.

```java
public class Main {
    public static void main(String[] args) {

        // Criando as paredes
        Walls wall1 = new Walls("North");
        Walls wall2 = new Walls("South");
        Walls wall3 = new Walls("East");
        Walls wall4 = new Walls("West");

        // Exibindo direções das paredes
        System.out.println("Walls:");
        System.out.println("Wall 1: " + wall1.getDirection());
        System.out.println("Wall 2: " + wall2.getDirection());
        System.out.println("Wall 3: " + wall3.getDirection());
        System.out.println("Wall 4: " + wall4.getDirection());

        // Criando o teto
        Ceiling ceiling = new Ceiling(12, 255); // altura 12, cor 255 (exemplo RGB ou código qualquer)
        System.out.println("\nCeiling:");
        System.out.println("Height: " + ceiling.getHeight() + "ft");
        System.out.println("Painted color: " + ceiling.getPaintedColor());

        // Criando a cama
        Bed bed = new Bed("Rustic", 4, 2, 2, 1);
        System.out.println("\nBed:");
        System.out.println("Style: " + bed.getStyle());
        System.out.println("Pillows: " + bed.getPillows());
        System.out.println("Height: " + bed.getHeight());
        System.out.println("Sheets: " + bed.getSheets());
        System.out.println("Quilt: " + bed.getQuilt());

        // Fazendo a cama
        System.out.print("Making the bed... ");
        bed.make();
        System.out.println();

        // Criando a lâmpada
        Lamp lamp = new Lamp("Vintage", true, 60);
        System.out.println("\nLamp:");
        System.out.println("Style: " + lamp.getStyle());
        System.out.println("Uses battery: " + lamp.isBattery());
        System.out.println("Glob rating: " + lamp.getGlobRating());

        // Acendendo a lâmpada
        System.out.print("Turning on the lamp... ");
        lamp.turnOn();
        System.out.println();
    }
}

```

### Explicação do código:
- O programa instancia quatro paredes, um teto, uma cama e uma lâmpada.
- Exibe os detalhes de cada objeto e simula ações como arrumar a cama e acender a lâmpada.

## Conclusão

Este exercício mostra como utilizar composição para construir um objeto mais complexo (`Bedroom`) com base em outros objetos menores e especializados (`Lamp`, `Bed`, `Wall`, `Ceiling`). Isso promove modularidade e reutilização no desenvolvimento orientado a objetos.