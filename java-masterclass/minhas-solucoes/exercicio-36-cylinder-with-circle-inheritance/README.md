# Exercício: Classe Cilindro com Herança de Círculo

Neste exercício, vamos criar uma hierarquia de classes onde a classe `Cylinder` herda da classe `Circle`. A classe `Circle` representa um círculo com um raio, enquanto a classe `Cylinder` estende `Circle` e adiciona uma altura, representando um cilindro.

## Passo 1: Criando a classe `Circle`

A classe `Circle` possui uma variável de instância `radius` e fornece métodos para obter o raio e calcular a área do círculo.

```java
public class Circle {
    private double radius;

    // Construtor que inicializa o raio, garantindo que o valor seja maior ou igual a 0
    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    // Método para obter o valor do raio
    public double getRadius() {
        return radius;
    }

    // Método para calcular e retornar a área do círculo (π * r²)
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
```

### Explicação do código:
- O construtor da classe `Circle` inicializa o raio, mas se o valor passado for negativo, o raio é ajustado para 0.
- O método `getArea` calcula a área do círculo utilizando a fórmula $( \pi \times r^2 )$, onde `r` é o raio do círculo.

## Passo 2: Criando a classe `Cylinder`

A classe `Cylinder` herda a classe `Circle` e adiciona uma nova variável `height` (altura). Ela também fornece um método para calcular o volume do cilindro.

```java
public class Cylinder extends Circle {
    private double height;

    // Construtor que inicializa o raio (herdado de Circle) e a altura
    public Cylinder(double radius, double height) {
        super(radius);  // Chama o construtor da classe Circle
        this.height = height > 0 ? height : 0;  // Garante que a altura seja maior ou igual a 0
    }

    // Método para obter a altura do cilindro
    public double getHeight() {
        return height;
    }

    // Método para calcular e retornar o volume do cilindro (Área da base * altura)
    public double getVolume() {
        return super.getArea() * height;
    }
}
```

### Explicação do código:
- A classe `Cylinder` herda de `Circle`, o que significa que ela já possui o método `getArea` da classe `Circle` e o campo `radius`.
- O construtor de `Cylinder` chama o construtor da classe `Circle` usando `super(radius)` para inicializar o raio. Em seguida, a altura é inicializada, mas se for negativa, ela é ajustada para 0.
- O método `getVolume` calcula o volume do cilindro, que é dado pela área da base (calculada pela classe `Circle`) multiplicada pela altura do cilindro.

## Passo 3: Testando as Classes

A classe `MainExerc36` testa a funcionalidade de ambas as classes `Circle` e `Cylinder`.

```java
public class MainExerc36 {

    public static void main(String[] args) {
        // Criando um objeto Circle
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        // Criando um objeto Cylinder
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
```

### Explicação do código:
- O programa cria um objeto `Circle` com raio 3.75 e imprime seu raio e área.
- Depois, ele cria um objeto `Cylinder` com raio 5.55 e altura 7.25, e imprime o raio, altura, área e volume do cilindro.

## Execução

Para compilar e executar:

1. Salve os arquivos `Circle.java`, `Cylinder.java` e `MainExerc36.java`.
2. Compile os arquivos com:
   ```
   javac Circle.java Cylinder.java MainExerc36.java
   ```
3. Execute a aplicação com:
   ```
   java MainExerc36
   ```

### Saída Esperada

A saída esperada do programa será:

```
circle.radius= 3.75
circle.area= 44.17864625012104
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.82367222344548
cylinder.volume= 702.1710427170739
```

Onde:
- A área do círculo é calculada como $( \pi \times (3.75)^2 )$.
- O volume do cilindro é calculado como $( \text{Área da base} \times \text{altura} = 96.82 \times 7.25 )$.

Essa implementação mostra o uso de herança, onde a classe `Cylinder` herda propriedades e métodos de `Circle`, e utiliza esses métodos para calcular o volume do cilindro.