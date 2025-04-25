# Exercício: Identificando o Maior Fator Primo de um Número

O objetivo deste exercício é escrever um método que calcule o maior fator primo de um número dado. O método deve verificar se o número é válido e, se for, calcular seu maior fator primo.

## Descrição dos Parâmetros

- **number**: Um número inteiro para o qual será calculado o maior fator primo.

## Regras

1. Se o número for negativo ou menor que 2, o método deve retornar `-1`, indicando um valor inválido.
2. O método deve calcular e retornar o maior fator primo do número. Se o número for primo, o método deve retornar o próprio número.

## Estratégia de Implementação

1. **Verificar se o número é válido**: Se o número for negativo ou menor que 2, deve retornar `-1`.
2. **Encontrar os fatores primos**: Começar a partir do menor número primo (2) e dividir o número enquanto for divisível por esse número.
3. **Armazenar o maior fator primo encontrado**: Durante o processo, armazenar o maior fator primo encontrado.
4. **Finalizar quando o número for completamente dividido**: Após o loop, se o número não for 1, ele será o maior fator primo.

### Código

```java
public class LargestPrime {

    public static int getLargestPrime(int num) {
        // Verificar se o número é negativo ou menor que 2
        if (num < 2) {
            return -1;
        }

        int factor = -1;

        // Verificar os fatores primos do número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // Se 'i' for um divisor de 'num'
            while (num % i == 0) {
                factor = i;  // Atualizar o maior fator primo
                num /= i;  // Dividir o número por 'i'
            }
        }

        // Se ainda restar um número maior que 1, ele é o maior fator primo
        return num == 1 ? factor : num;
    }
}

public class MainExerc26 {

    public static void main(String[] args) {
        // Testes de exemplo
        System.out.println(LargestPrime.getLargestPrime(21));   // Esperado: 7
        System.out.println(LargestPrime.getLargestPrime(217));  // Esperado: 31
        System.out.println(LargestPrime.getLargestPrime(0));    // Esperado: -1
        System.out.println(LargestPrime.getLargestPrime(45));   // Esperado: 5
        System.out.println(LargestPrime.getLargestPrime(-1));   // Esperado: -1
    }
}
```

### Explicação do Código

1. **`getLargestPrime(int num)`**:
    - **Validação de entrada**: Se o número for menor que 2, retorna `-1`.
    - **Loop para encontrar fatores primos**: O loop percorre os números de 2 até a raiz quadrada do número, procurando por divisores.
    - **Divisão do número**: Quando um divisor é encontrado, ele é usado para dividir o número até que não seja mais divisível por ele. O maior divisor encontrado é armazenado na variável `factor`.
    - **Finalização**: Quando o número já não pode ser mais dividido por números menores que sua raiz quadrada, se restar um número maior que 1, ele é o maior fator primo.

2. **`MainExerc26`**:
    - O método `main` executa alguns testes de exemplo para validar o comportamento do método `getLargestPrime`.

### Testes

1. **`getLargestPrime(21)`**: A decomposição em fatores primos de 21 é 3 e 7, e o maior fator primo é 7.
2. **`getLargestPrime(217)`**: A decomposição em fatores primos de 217 é 7 e 31, e o maior fator primo é 31.
3. **`getLargestPrime(0)`**: O número 0 não possui fatores primos, então o retorno é `-1`.
4. **`getLargestPrime(45)`**: A decomposição em fatores primos de 45 é 3 e 5, e o maior fator primo é 5.
5. **`getLargestPrime(-1)`**: O número -1 é inválido, então o retorno é `-1`.

### Resultados Esperados

```
7
31
-1
5
-1
```

Esse código encontra corretamente o maior fator primo de um número e lida com os casos inválidos conforme especificado.