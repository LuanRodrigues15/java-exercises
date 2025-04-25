# Exercício: Operações com Números Complexos

Neste exercício, vamos criar uma classe `ComplexNumber` que representa um número complexo da forma $( a + bi )$, onde $( a )$ é a parte real e $( b )$ é a parte imaginária. A classe terá métodos para realizar operações de adição e subtração, tanto com números complexos quanto com números reais e imaginários.

## Classes

### 1. **ComplexNumber Class**

A classe `ComplexNumber` representa o número complexo. Ela contém dois campos: `real` e `imaginary`, ambos do tipo `double`. A classe oferece métodos para obter as partes real e imaginária do número complexo, além de métodos para adicionar e subtrair números complexos.

```java
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Construtor que inicializa as partes real e imaginária
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Método para obter a parte real
    public double getReal() {
        return real;
    }

    // Método para obter a parte imaginária
    public double getImaginary() {
        return imaginary;
    }

    // Método para adicionar um número real e imaginário ao número complexo
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Método para adicionar outro número complexo
    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    // Método para subtrair um número real e imaginário do número complexo
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Método para subtrair outro número complexo
    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }
}
```

### 2. **MainExerc35 Class**

A classe `MainExerc35` é a classe principal que testa a classe `ComplexNumber`. Ela cria dois números complexos e realiza operações de adição e subtração.

```java
public class MainExerc35 {

    public static void main(String[] args) {
        // Criando dois números complexos
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        // Adicionando 1 + 1i ao número 'one'
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        // Subtraindo o número 'number' do número 'one'
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        // Subtraindo o número 'one' do número 'number'
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
```

## Execução

Para compilar e executar:

1. Salve os arquivos `ComplexNumber.java` e `MainExerc35.java`.
2. Compile os arquivos com:
   ```
   javac ComplexNumber.java MainExerc35.java
   ```
3. Execute a aplicação com:
   ```
   java MainExerc35
   ```

### Saída Esperada

A saída imprimirá os resultados das operações de adição e subtração com os números complexos:

```
one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0
```

Onde:

1. Inicialmente, o número complexo `one` é 1.0 + 1.0i. Depois de adicionar 1 + 1i, ele se torna 2.0 + 2.0i.
2. Subtraindo o número complexo `number` (2.5 - 1.5i) de `one`, o novo valor de `one` se torna -0.5 + 3.5i.
3. Finalmente, subtraindo o número `one` (-0.5 + 3.5i) de `number`, o valor final de `number` se torna 3.0 - 5.0i.

Esta implementação permite que você trabalhe com números complexos, realizando operações como adição e subtração de forma simples.