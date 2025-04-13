# Exercício: Avaliação Positivo, Negativo ou Zero

Este exercício foi desenvolvido durante o curso **Java Masterclass 2025** na Udemy, e tem como objetivo avaliar se um número inteiro informado pelo usuário é **positivo**, **negativo** ou **zero**.

## 📚 Descrição

Crie um método chamado `checkNumber` que recebe um número inteiro como parâmetro e imprime:
- **"Positivo"** se o número for maior que 0.
- **"Negativo"** se o número for menor que 0.
- **"Zero"** se o número for igual a 0.

## 📌 Implementação

O código foi dividido em duas classes:

- **PositivoNegativoZero.java** — contém o método `checkNumber`.
- **Main.java** — onde o programa solicita um número ao usuário e chama o método.

### 📁 PositivoNegativoZero.java

```java
public class PositivoNegativoZero {
    public static void checkNumber(int number){
        System.out.println((number > 0 ? "Positivo" : number < 0 ? "Negativo" : "Zero"));
    }
}
