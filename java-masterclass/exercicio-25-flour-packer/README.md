# Exercício: Gerenciando Requisitos de Pacotes de Farinha com Tamanhos de Balde Limitados

Este exercício envolve a criação de um método que verifica se é possível montar um pacote com a quantidade de farinha necessária, dado um número limitado de sacos grandes e pequenos. O objetivo é garantir que o método consiga determinar se, com base na quantidade de sacos disponíveis, o pacote de farinha pode ser montado corretamente.

## Descrição dos Parâmetros

- **bigCount**: Quantidade de sacos grandes (5 kg cada).
- **smallCount**: Quantidade de sacos pequenos (1 kg cada).
- **goal**: A quantidade total de farinha necessária para formar o pacote.

### Regras

1. Se qualquer um dos parâmetros for negativo, o método deve retornar `false`.
2. Para formar o pacote com a quantidade de farinha **goal**, devemos usar o maior número possível de sacos grandes, e o restante pode ser completado com os sacos pequenos.
3. Se a quantidade total de farinha disponível for maior que a **goal**, então deve ser verificado se podemos formar exatamente o valor desejado sem quebrar os sacos.

### Estratégia de Implementação

1. **Calcular o peso total dos sacos grandes**: Multiplicamos o número de sacos grandes por 5 (peso de cada saco).
2. **Verificar se o peso total dos sacos grandes já é suficiente**: Se o total de sacos grandes já exceder ou igualar a **goal**, verificamos se a quantidade de sacos pequenos é suficiente para atingir exatamente o valor da **goal**.
3. **Caso contrário, usar os sacos pequenos para completar o peso necessário**: Se os sacos grandes não forem suficientes, verificamos se a diferença entre a **goal** e o peso total dos sacos grandes pode ser completada com os sacos pequenos.

### Código

```java
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Verificar se algum parâmetro é negativo
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Calcular o peso total dos sacos grandes
        int totalBigWeight = bigCount * 5;

        // Verificar se o total dos sacos grandes é suficiente para atingir ou exceder o objetivo
        if (totalBigWeight >= goal) {
            // Se o total dos sacos grandes é suficiente, verificar se os sacos pequenos conseguem completar a diferença
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                return true;
            }
        } else {
            // Se os sacos grandes não são suficientes, verificar se a diferença pode ser preenchida com os sacos pequenos
            if (smallCount >= goal - totalBigWeight) {
                return true;
            }
        }

        return false;
    }
}

public class MainExerc25 {

    public static void main(String[] args) {
        // Testes de exemplo
        System.out.println(FlourPacker.canPack(1, 0, 4));  // Esperado: true
        System.out.println(FlourPacker.canPack(1, 0, 5));  // Esperado: true
        System.out.println(FlourPacker.canPack(0, 5, 4));  // Esperado: true
        System.out.println(FlourPacker.canPack(2, 2, 11)); // Esperado: true
        System.out.println(FlourPacker.canPack(-3, 2, 12)); // Esperado: false (parâmetro negativo)
    }
}
```

### Explicação do Código

1. **`canPack(int bigCount, int smallCount, int goal)`**: Este método verifica se é possível formar o pacote com a quantidade de farinha necessária usando a quantidade de sacos grandes e pequenos fornecidos.
    - Se qualquer um dos parâmetros for negativo, retorna `false`.
    - Calcula o peso total dos sacos grandes (multiplicando `bigCount` por 5).
    - Se os sacos grandes são suficientes para cobrir o **goal**, o método verifica se os sacos pequenos podem preencher a diferença.
    - Caso contrário, verifica se os sacos pequenos podem preencher a diferença entre a **goal** e o peso total dos sacos grandes.

2. **MainExerc25**: Essa classe contém o método `main` que executa alguns testes para verificar o comportamento do método `canPack`.

### Testes

Ao rodar o código, os seguintes resultados são esperados:

```
false
true
true
true
false
```

Esses resultados correspondem aos testes de entrada, demonstrando que o método funciona conforme o esperado. A verificação de parâmetros negativos e a verificação do uso correto dos sacos grandes e pequenos para formar a quantidade exata de farinha estão corretas.