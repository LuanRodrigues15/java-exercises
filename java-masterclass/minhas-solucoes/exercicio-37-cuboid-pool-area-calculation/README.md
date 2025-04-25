# Exercício: Cálculo de Área e Volume de Piscina Retangular (Cuboid)

Neste exercício, vamos criar uma hierarquia de classes onde a classe `Cuboid` herda da classe `Rectangle`. A classe `Rectangle` representa a base retangular de uma piscina, enquanto a classe `Cuboid` estende `Rectangle` e adiciona a altura, representando a piscina como um cuboide tridimensional.

## Passo 1: Criando a classe `Rectangle`

A classe `Rectangle` possui duas variáveis de instância: `width` (largura) e `length` (comprimento). Ela fornece métodos para acessar esses valores e calcular a área da base.

```java
public class Rectangle {
    private double width;
    private double length;

    // Construtor que inicializa largura e comprimento, garantindo que ambos sejam >= 0
    public Rectangle(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    // Método para obter a largura
    public double getWidth() {
        return width;
    }

    // Método para obter o comprimento
    public double getLength() {
        return length;
    }

    // Método para calcular e retornar a área da base (largura * comprimento)
    public double getArea() {
        return width * length;
    }
}
```

### Explicação do código:
- O construtor verifica se os valores de `width` e `length` são válidos (não negativos) e os ajusta para 0 se necessário.
- O método `getArea` calcula a área da base utilizando a fórmula $( \text{largura} \times \text{comprimento} )$.

## Passo 2: Criando a classe `Cuboid`

A classe `Cuboid` herda de `Rectangle` e adiciona uma nova variável `height` (altura). Ela fornece um método para calcular o volume total da piscina.

```java
public class Cuboid extends Rectangle {
    private double height;

    // Construtor que inicializa largura, comprimento (herdados) e altura
    public Cuboid(double width, double lenght, double height) {
        super(width, lenght); // Chama o construtor da classe Rectangle
        this.height = height > 0 ? height : 0; // Garante que a altura seja >= 0
    }

    // Método para obter a altura do cuboide
    public double getHeight() {
        return height;
    }

    // Método para calcular e retornar o volume do cuboide (área da base * altura)
    public double getVolume() {
        return super.getArea() * height;
    }
}
```

### Explicação do código:
- A classe `Cuboid` reutiliza os métodos de `Rectangle` para acessar largura, comprimento e calcular a área da base.
- O volume é calculado multiplicando a área da base pela altura.

## Passo 3: Testando as Classes

A classe `MainExerc37` demonstra como as classes `Rectangle` e `Cuboid` funcionam na prática.

```java
public class MainExerc37 {

    public static void main(String[] args) {
        // Criando um objeto Rectangle (base da piscina)
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        // Criando um objeto Cuboid (piscina completa)
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
```

### Explicação do código:
- O programa cria um objeto `Rectangle` com largura 5 e comprimento 10, e exibe os valores e a área.
- Em seguida, cria um objeto `Cuboid` com as mesmas dimensões de base e altura 5. Ele exibe a largura, comprimento, área da base, altura e o volume da piscina.

## Execução

Para compilar e executar:

1. Salve os arquivos `Rectangle.java`, `Cuboid.java` e `MainExerc37.java`.
2. Compile os arquivos com:
```
javac Rectangle.java Cuboid.java MainExerc37.java
```
3. Execute a aplicação com:
```
java MainExerc37
```

### Saída Esperada

A saída esperada do programa será:

```
rectangle.width= 5.0
rectangle.length= 10.0
rectangle.area= 50.0
cuboid.width= 5.0
cuboid.length= 10.0
cuboid.area= 50.0
cuboid.height= 5.0
cuboid.volume= 250.0
```

Onde:
- A área do retângulo (base da piscina) é calculada como $( 5 \times 10 = 50 )$.
- O volume da piscina (cuboide) é $( \text{área da base} \times \text{altura} = 50 \times 5 = 250 )$.

Essa implementação mostra como utilizar herança para reaproveitar código, adicionando comportamentos e propriedades específicas na classe derivada `Cuboid`.