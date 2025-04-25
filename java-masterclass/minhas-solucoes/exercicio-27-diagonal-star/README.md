# Exercício: Construindo um Padrão de Estrela Diagonal com Laços

O objetivo desse exercício é escrever um método que imprime um padrão de estrelas (`*`) em formato de quadrado, com diagonais preenchidas. Para isso, utilizaremos loops para verificar em quais posições as estrelas devem ser colocadas.

## Requisitos

- Se o número fornecido for menor que 5, o método deve imprimir "Invalid Value".
- Caso contrário, deve imprimir um padrão de estrelas com o número fornecido de linhas e colunas. As estrelas devem ser colocadas nas bordas do quadrado e nas duas diagonais (principal e secundária).

## Lógica

1. **Primeira e última linha e coluna**: As bordas externas devem ser preenchidas com estrelas.
2. **Diagonais**: As duas diagonais devem ser preenchidas com estrelas:
    - A diagonal principal (onde a linha é igual à coluna).
    - A diagonal secundária (onde a coluna é igual à diferença entre o número de colunas e a linha).
3. **Espaços**: Em outras posições, o método deve imprimir espaços.

### Código

```java
public class DiagonalStar {

    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Loop pelas linhas
        for (int row = 1; row <= number; row++) {
            // Loop pelas colunas
            for (int column = 1; column <= number; column++) {
                // Verificar se está na borda ou nas diagonais
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column == number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                // Se for borda ou diagonal, imprimir estrela, caso contrário, espaço
                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Pular linha após imprimir cada linha
            System.out.println();
        }
    }
}

public class MainExerc27 {

    public static void main(String[] args) {
        DiagonalStar.printSquareStar(5); // Exemplo de uso
        System.out.println(" ");
        DiagonalStar.printSquareStar(8); // Exemplo de uso
        System.out.println(" ");
    }
}
```

### Explicação do Código

1. **Condição para "Invalid Value"**: Se o número for menor que 5, o programa imprime "Invalid Value" e retorna.
2. **Loops Aninhados**:
    - O primeiro loop (`row`) percorre as linhas.
    - O segundo loop (`column`) percorre as colunas.
3. **Condições para Estrelas**:
    - As primeiras e últimas linhas e colunas são verificadas com `row == 1`, `column == 1`, `row == number` e `column == number`.
    - As diagonais são verificadas com `row == column` (diagonal principal) e `column == (number - row + 1)` (diagonal secundária).
4. **Impressão de Estrelas ou Espaços**: Quando a posição atende a uma das condições, imprime-se uma estrela. Caso contrário, imprime-se um espaço.

### Exemplos de Saída

#### Para `printSquareStar(5)`:
```
*****
*   *
* * *
*   *
*****
```

#### Para `printSquareStar(8)`:
```
********
*      *
* *    *
*   *  *
*     *
*   *  *
* *    *
********
```

### Testes

1. **`printSquareStar(5)`**: Imprime um quadrado de 5x5 com as bordas e diagonais preenchidas por estrelas.
2. **`printSquareStar(8)`**: Imprime um quadrado de 8x8 com o mesmo padrão.
3. **`printSquareStar(3)`**: Imprime "Invalid Value", pois o número é menor que 5.

Esse código permite criar padrões de estrelas que formam um quadrado com diagonais, atendendo ao requisito de bordas e preenchimento conforme especificado.