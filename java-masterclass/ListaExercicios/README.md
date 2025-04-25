# Seção 5: Mastering Java Expressions, Statements, Code Blocks, And Method Overloading

## Exercício 1 — Positive, Negative, Or Zero

- **Descrição:** Escreva um método chamado `checkNumber` com um parâmetro inteiro chamado `number`.
    - O método deve imprimir:
        - `"positive"` se o número for maior que 0
        - `"negative"` se o número for menor que 0
        - `"zero"` se o número for igual a 0
    - O método deve ser `public static`.
---
## Exercício 2 — Speed Converter

- **Descrição:**
    1. Escreva um método chamado `toMilesPerHour` com um parâmetro `kilometersPerHour` do tipo `double`.
        - Se o valor for menor que 0, deve retornar `-1`.
        - Caso contrário, converte `kilometersPerHour` para milhas por hora, arredonda com `Math.round` e retorna esse valor do tipo `long`.

    2. Escreva outro método chamado `printConversion` com um parâmetro `kilometersPerHour` do tipo `double`.
        - Se o valor for menor que 0, imprime `"Invalid Value"`.
        - Caso contrário, converte o valor para milhas por hora usando o método `toMilesPerHour` e imprime a mensagem no formato:  
          `XX km/h = YY mi/h`, onde XX é o valor original e YY é o valor convertido.

    - Ambos os métodos devem ser `public static`.
---
## Exercício 3 — Accurate MegaBytes Converter

- **Descrição:**
    - Escreva um método chamado `printMegaBytesAndKiloBytes` com um parâmetro `kiloBytes` do tipo `int`.
    - O método deve calcular quantos megabytes correspondem ao valor em kilobytes e os kilobytes restantes, e imprimir a mensagem no formato:  
      `"XX KB = YY MB and ZZ KB"`, onde:
        - `XX` é o valor original de kilobytes
        - `YY` é o valor calculado em megabytes (inteiro)
        - `ZZ` é o valor dos kilobytes restantes.
    - Se o parâmetro `kiloBytes` for menor que 0, imprima `"Invalid Value"`.
    - 1 MB = 1024 KB.
---
## Exercício 4 — Barking Dog

- **Descrição:**
    - Escreva um método chamado `shouldWakeUp` com dois parâmetros:
        1. `barking` (do tipo `boolean`) que indica se o cachorro está latindo.
        2. `hourOfDay` (do tipo `int`) que representa a hora do dia, variando entre 0 e 23.
    - O método deve retornar `true` se o cachorro estiver latindo antes das 8 horas ou depois das 22 horas.
    - Caso contrário, deve retornar `false`.
    - Se o parâmetro `hourOfDay` for menor que 0 ou maior que 23, o método deve retornar `false`.
---
## Exercício 5 — Leap Year Calculator

- **Descrição:**
    - Escreva um método chamado `isLeapYear` com um parâmetro `year` do tipo `int`.
    - O parâmetro deve ser maior ou igual a 1 e menor ou igual a 9999. Se o parâmetro estiver fora desse intervalo, o método deve retornar `false`.
    - Caso contrário, o método deve verificar se o ano é bissexto, seguindo estas regras:
        1. Se o ano for divisível por 4, vá para o passo 2. Caso contrário, vá para o passo 5.
        2. Se o ano for divisível por 100, vá para o passo 3. Caso contrário, vá para o passo 4.
        3. Se o ano for divisível por 400, vá para o passo 4. Caso contrário, vá para o passo 5.
        4. O ano é bissexto (366 dias), então retorne `true`.
        5. O ano não é bissexto (365 dias), então retorne `false`.
---
## Exercício 6 — Decimal Comparator

- **Descrição:**
    - Escreva um método chamado `areEqualByThreeDecimalPlaces` com dois parâmetros do tipo `double`.
    - O método deve retornar `true` se os dois números `double` forem iguais até a terceira casa decimal. Caso contrário, deve retornar `false`.
    - Use casting para comparar os valores até três casas decimais.
---
## Exercício 7 — Equal Sum Checker

- **Descrição:**
    - Escreva um método chamado `hasEqualSum` com três parâmetros do tipo `int`.
    - O método deve retornar `true` se a soma do primeiro e do segundo parâmetro for igual ao terceiro parâmetro. Caso contrário, deve retornar `false`.
---
## Exercício 8 — Teen Number Checker

- **Descrição:**
    - Escreva um método chamado `hasTeen` com três parâmetros do tipo `int`.
    - O método deve retornar `true` se pelo menos um dos parâmetros estiver no intervalo de 13 a 19 (inclusive). Caso contrário, deve retornar `false`.

- **Método adicional:**
    - `isTeen` — recebe um único `int` como parâmetro e retorna `true` se o valor estiver entre 13 e 19 (inclusive), ou `false` caso contrário.
---
## Exercício 9 — Area Calculator

- **Descrição:**
    - Escreva um método chamado `area` com um parâmetro do tipo `double` chamado `radius` que retorna a área de um círculo.
    - Se o parâmetro `radius` for negativo, o método deve retornar `-1.0` para representar um valor inválido.

- **Método sobrecarregado:**
    - Escreva outro método chamado `area` com dois parâmetros `x` e `y` (ambos do tipo `double`) que representam os lados de um retângulo. O método deve retornar a área do retângulo.
    - Se um ou ambos os parâmetros forem negativos, o método deve retornar `-1.0` para indicar um valor inválido.
---
## Exercício 10 — Minutes To Years And Days Calculator

- **Descrição:**
    - Escreva um método chamado `printYearsAndDays` com um parâmetro do tipo `long` chamado `minutes` que calcula os anos e dias a partir dos minutos informados.
    - Se o parâmetro for negativo, o método deve imprimir "Invalid Value".
    - Caso contrário, o método deve imprimir uma mensagem no formato: `"XX min = YY y and ZZ d"`, onde:
        - `XX` representa o valor original de minutos.
        - `YY` representa os anos calculados.
        - `ZZ` representa os dias calculados.
---
## Exercício 11 — Equality Printer

- **Descrição:**
    - Escreva um método chamado `printEqual` com três parâmetros do tipo `int`.
    - O método não deve retornar nada (`void`) e deve:
        - Imprimir `"Invalid Value"` se **qualquer um dos parâmetros for menor que 0**.
        - Imprimir `"All numbers are equal"` se **todos os números forem iguais**.
        - Imprimir `"All numbers are different"` se **todos os números forem diferentes**.
        - Caso contrário, imprimir `"Neither all are equal or different"`.

---
## Exercício 12 — Playing Cat

- **Descrição:**
    - Escreva um método chamado `isCatPlaying` com dois parâmetros:
        - `boolean summer`: representa se é verão.
        - `int temperature`: representa a temperatura atual.
    - O método deve retornar `true` se:
        - A temperatura estiver entre **25 e 35 (inclusive)**, **ou**
        - Se for verão (`summer == true`) e a temperatura estiver entre **25 e 45 (inclusive)**.
    - Caso contrário, deve retornar `false`.

---
# Seção 6: Mastering Conditional Logic, Loops, And Interactive Java Applications

## Exercício 13 — Number In Word

- **Descrição:**
    - Escreva um método chamado `printNumberInWord` com um parâmetro:
        - `int number`: representa um número inteiro.
    - O método deve imprimir:
        - `"ZERO"` se o número for `0`
        - `"ONE"` se o número for `1`
        - `"TWO"` se o número for `2`
        - `"THREE"` se o número for `3`
        - `"FOUR"` se o número for `4`
        - `"FIVE"` se o número for `5`
        - `"SIX"` se o número for `6`
        - `"SEVEN"` se o número for `7`
        - `"EIGHT"` se o número for `8`
        - `"NINE"` se o número for `9`
        - `"OTHER"` para qualquer outro valor (incluindo negativos)
    - Pode-se usar `if-else` ou `switch` para a implementação.

---
## Exercício 14 — Leap Year and Days In Month Calculator

- **Descrição:**
    - Escreva um método chamado `isLeapYear` com um parâmetro `year` do tipo `int`:
        - O ano deve estar no intervalo de 1 a 9999.
        - Se o ano não estiver nesse intervalo, o método deve retornar `false`.
        - Caso o ano seja válido, deve verificar se é um ano bissexto e retornar `true` ou `false` conforme o caso. Um ano é bissexto se for divisível por 4, mas não por 100, ou se for divisível por 400.
    - Escreva outro método chamado `getDaysInMonth` que recebe dois parâmetros:
        - `month` (tipo `int`) e `year` (tipo `int`).
        - O método deve retornar o número de dias do mês, levando em consideração os anos bissextos. Por exemplo, o mês de fevereiro tem 29 dias em anos bissextos e 28 dias em anos comuns.
        - Se o mês for menor que 1 ou maior que 12, ou se o ano estiver fora do intervalo de 1 a 9999, o método deve retornar `-1`.

- **Exemplos de entrada/saída:**

    - `isLeapYear(-1600);` → deve retornar `false`, já que o parâmetro não está no intervalo de 1 a 9999.
    - `isLeapYear(1600);` → deve retornar `true`, pois 1600 é um ano bissexto.
    - `isLeapYear(2017);` → deve retornar `false`, já que 2017 não é um ano bissexto.
    - `isLeapYear(2000);` → deve retornar `true`, pois 2000 é um ano bissexto.

    - `getDaysInMonth(1, 2020);` → deve retornar `31`, já que janeiro tem 31 dias.
    - `getDaysInMonth(2, 2020);` → deve retornar `29`, já que fevereiro tem 29 dias em um ano bissexto (2020).
    - `getDaysInMonth(2, 2018);` → deve retornar `28`, já que fevereiro tem 28 dias em um ano comum (2018).
    - `getDaysInMonth(-1, 2020);` → deve retornar `-1`, já que o mês informado é inválido.
    - `getDaysInMonth(1, -2020);` → deve retornar `-1`, já que o ano informado está fora do intervalo de 1 a 9999.

---
## Exercício 15 — Somando Números Ímpares em um Intervalo Especificado

- **Descrição:**
    - Escreva um método chamado `isOdd` que recebe um parâmetro do tipo `int` chamado `number`. O método deve retornar um valor booleano:
        - Se `number` for maior que 0 e ímpar, deve retornar `true`.
        - Caso contrário, deve retornar `false`.

    - Escreva um segundo método chamado `sumOdd`, que recebe dois parâmetros do tipo `int` chamados `start` e `end`, representando um intervalo de números.
        - O método deve usar um laço `for` para somar todos os números ímpares dentro desse intervalo, incluindo o valor de `end`.
        - O método deve chamar o método `isOdd` para verificar se cada número dentro do intervalo é ímpar.
        - O parâmetro `end` deve ser maior ou igual ao parâmetro `start`, e ambos devem ser maiores que 0.
        - Caso essas condições não sejam atendidas, o método deve retornar `-1` para indicar uma entrada inválida.

- **Exemplos de entrada/saída:**

    - `sumOdd(1, 100);` → deve retornar `2500`.
    - `sumOdd(-1, 100);` → deve retornar `-1` (entrada inválida, pois `start` é negativo).
    - `sumOdd(100, 100);` → deve retornar `0` (não há números ímpares no intervalo).
    - `sumOdd(13, 13);` → deve retornar `13` (o intervalo contém o número ímpar 13).
    - `sumOdd(100, -100);` → deve retornar `-1` (entrada inválida, pois `end` é menor que `start`).
    - `sumOdd(100, 1000);` → deve retornar `247500`.

---
## Exercício 16 — Identificando Números Palíndromos

- **Descrição:**
    - Escreva um método chamado `isPalindrome` que recebe um parâmetro do tipo `int` chamado `number`.
    - O método deve retornar um valor booleano:
        - Deve retornar `true` se o número for um palíndromo.
        - Caso contrário, deve retornar `false`.

    - Um número é considerado palíndromo se, ao ser invertido, for igual ao valor original (ex.: 121, 12321, -1221, 1001).

- **Dicas:**
    - Utilize um laço `while` para inverter o número.
    - Lembre-se de lidar corretamente com números negativos — eles também podem ser palíndromos.

- **Exemplos de entrada/saída:**

    - `isPalindrome(-1221);` → deve retornar `true`.
    - `isPalindrome(707);` → deve retornar `true`.
    - `isPalindrome(11212);` → deve retornar `false` (o reverso é 21211).

---
## Exercício 17 — Somando o Primeiro e o Último Dígito

- **Descrição:**
    - Escreva um método chamado `sumFirstAndLastDigit` com um parâmetro do tipo `int` chamado `number`.
    - O método deve encontrar o primeiro e o último dígito do número recebido e retornar a soma desses dois valores.
    - Se o número for negativo, o método deve retornar `-1` para indicar valor inválido.

- **Dicas:**
    - Use o operador `%` para obter o último dígito.
    - Use um laço `while` para encontrar o primeiro dígito dividindo sucessivamente o número por 10.

- **Exemplos de entrada/saída:**

    - `sumFirstAndLastDigit(252);` → deve retornar `4` (`2 + 2`)
    - `sumFirstAndLastDigit(257);` → deve retornar `9` (`2 + 7`)
    - `sumFirstAndLastDigit(0);` → deve retornar `0` (`0 + 0`)
    - `sumFirstAndLastDigit(5);` → deve retornar `10` (`5 + 5`)
    - `sumFirstAndLastDigit(-10);` → deve retornar `-1`
---
## Exercício 18 — Somando Dígitos Pares de um Número

- **Descrição:**
    - Escreva um método chamado `getEvenDigitSum` com um parâmetro do tipo `int` chamado `number`.
    - O método deve retornar a soma de todos os dígitos pares presentes no número.
    - Se o número for negativo, o método deve retornar `-1` para indicar valor inválido.

- **Dicas:**
    - Use o operador `%` para extrair os dígitos do número.
    - Use o operador `% 2` para verificar se o dígito é par.
    - Use um laço `while` para percorrer todos os dígitos do número.

- **Exemplos de entrada/saída:**

    - `getEvenDigitSum(123456789);` → deve retornar `20` (`2 + 4 + 6 + 8`)
    - `getEvenDigitSum(252);` → deve retornar `4` (`2 + 2`)
    - `getEvenDigitSum(-22);` → deve retornar `-1`

---
## Exercício 19 — Verificando Dígitos Compartilhados Entre Dois Números

- **Descrição:**
    - Escreva um método chamado `hasSharedDigit` com dois parâmetros do tipo `int`.
    - Cada número deve estar no intervalo de 10 (inclusive) a 99 (inclusive). Se um dos números não estiver dentro desse intervalo, o método deve retornar `false`.
    - O método deve retornar `true` se houver um dígito que aparece em ambos os números. Caso contrário, o método deve retornar `false`.

- **Exemplos de entrada/saída:**

    - `hasSharedDigit(12, 23);` → deve retornar `true` já que o dígito `2` aparece em ambos os números.
    - `hasSharedDigit(9, 99);` → deve retornar `false` já que `9` não está no intervalo de 10 a 99.
    - `hasSharedDigit(15, 55);` → deve retornar `true` já que o dígito `5` aparece em ambos os números.

---
## Exercício 20 — Avaliando o Último Dígito para Comparações Múltiplas de Números Inteiros

- **Descrição:**
    - Escreva um método chamado `hasSameLastDigit` com três parâmetros do tipo `int`.
    - Cada número deve estar no intervalo de 10 (inclusive) a 1000 (inclusive). Se um dos números não estiver dentro desse intervalo, o método deve retornar `false`.
    - O método deve retornar `true` se pelo menos dois dos números tiverem o mesmo dígito mais à direita; caso contrário, deve retornar `false`.

- **Exemplos de entrada/saída:**

    - `hasSameLastDigit(41, 22, 71);` → deve retornar `true` já que o dígito `1` é o mais à direita nos números 41 e 71.
    - `hasSameLastDigit(23, 32, 42);` → deve retornar `true` já que o dígito `2` é o mais à direita nos números 32 e 42.
    - `hasSameLastDigit(9, 99, 999);` → deve retornar `false` já que `9` não está no intervalo de 10 a 1000.

- **Método adicional:**

    - Escreva outro método chamado `isValid` com um parâmetro do tipo `int`.
    - O método deve retornar `true` se o número passado como parâmetro estiver no intervalo de 10 (inclusive) a 1000 (inclusive), caso contrário, deve retornar `false`.

    - **Exemplos de entrada/saída:**
        - `isValid(10);` → deve retornar `true` já que 10 está dentro do intervalo de 10 a 1000.
        - `isValid(468);` → deve retornar `true` já que 468 está dentro do intervalo de 10 a 1000.
        - `isValid(1051);` → deve retornar `false` já que 1051 não está dentro do intervalo de 10 a 1000.

---

## Exercício 21 — Listando Todos os Fatores de um Número Dado

- **Descrição:**
    - Escreva um método chamado `printFactors` com um parâmetro do tipo `int` chamado `number`.
    - Se `number` for menor que 1, o método deve imprimir "Invalid Value".
    - O método deve imprimir todos os fatores do número. Um fator de um número é um número inteiro que divide esse número completamente (sem deixar resto). Ou seja, se `number` for divisível por `i` sem deixar resto, então `i` é um fator de `number`.

- **Exemplos de entrada/saída:**
    - `printFactors(6);` → deve imprimir:
      ```
      1
      2
      3
      6
      ```
    - `printFactors(32);` → deve imprimir:
      ```
      1
      2
      4
      8
      16
      32
      ```
    - `printFactors(10);` → deve imprimir:
      ```
      1
      2
      5
      10
      ```
    - `printFactors(-1);` → deve imprimir "Invalid Value" já que o número é menor que 1.

- **Dica:**
    - Use um laço `while` ou `for` para iterar sobre os números e verificar se eles são divisores de `number`.

---
## Exercício 22 — Derivando o Máximo Divisor Comum (MDC) de Forma Eficiente

- **Descrição:**
    - Escreva um método chamado `getGreatestCommonDivisor` com dois parâmetros do tipo `int` chamados `first` e `second`.
    - Se um dos parâmetros for menor que 10, o método deve retornar -1 para indicar um valor inválido.
    - O método deve retornar o maior divisor comum (MDC) entre os dois números fornecidos.

- **O que é o Máximo Divisor Comum (MDC)?**  
  O MDC de dois números inteiros é o maior número que pode dividir ambos sem deixar resto. Por exemplo:
    - O MDC de 12 e 30 é 6, pois ambos podem ser divididos por 6 sem deixar resto.

  **Exemplo de cálculos para o MDC entre 12 e 30:**
    - Fatores de 12: 1, 2, 3, 4, 6, 12
    - Fatores de 30: 1, 2, 3, 5, 6, 10, 15, 30
    - O maior divisor comum entre 12 e 30 é 6.

- **Exemplos de entrada/saída:**
    - `getGreatestCommonDivisor(25, 15);` → deve retornar `5` pois ambos podem ser divididos por 5 sem deixar resto.
    - `getGreatestCommonDivisor(12, 30);` → deve retornar `6` pois ambos podem ser divididos por 6 sem deixar resto.
    - `getGreatestCommonDivisor(9, 18);` → deve retornar `-1` pois o primeiro parâmetro é menor que 10.
    - `getGreatestCommonDivisor(81, 153);` → deve retornar `9` pois ambos podem ser divididos por 9 sem deixar resto.

- **Dicas:**
    - Use um laço `while` ou `for` para verificar os divisores.
    - Encontre o menor valor entre os dois números e use-o como limite para buscar o MDC.

---
## Exercício 23 — Confirmando Números Perfeitos Através da Soma dos Divisores Próprios

- **Descrição:**
    - Escreva um método chamado `isPerfectNumber` com um parâmetro do tipo `int` chamado `number`.
    - Se o número for menor que 1, o método deve retornar `false`.
    - O método deve calcular se o número é perfeito. Um número perfeito é aquele que é igual à soma de seus divisores próprios positivos, excluindo ele mesmo.

- **O que é um número perfeito?**  
  Um número perfeito é um número inteiro positivo que é igual à soma dos seus divisores próprios. Os divisores próprios de um número são aqueles números inteiros positivos que o dividem sem deixar resto, excluindo o próprio número.

  **Exemplo:**
    - O número 6 é perfeito, pois seus divisores próprios são 1, 2 e 3, e a soma desses divisores é:  
      `1 + 2 + 3 = 6`.

- **Exemplos de entrada/saída:**
    - `isPerfectNumber(6);` → deve retornar `true` pois os divisores próprios de 6 são 1, 2 e 3, e a soma é `1 + 2 + 3 = 6`.
    - `isPerfectNumber(28);` → deve retornar `true` pois os divisores próprios de 28 são 1, 2, 4, 7, 14, e a soma é `1 + 2 + 4 + 7 + 14 = 28`.
    - `isPerfectNumber(5);` → deve retornar `false` pois o único divisor próprio de 5 é 1, e a soma é `1` e não `5`.
    - `isPerfectNumber(-1);` → deve retornar `false` pois o número é menor que 1.

- **Dicas:**
    - Utilize um laço `while` ou `for` para encontrar os divisores do número.
    - Use o operador de resto (`%`) para verificar se o número é divisível sem deixar resto.

---
## Exercício 24 — Convertendo Dígitos em Palavras e Tratando Casos de Bordas

- **Descrição:**  
  Escreva três métodos para realizar a conversão de números inteiros em palavras de forma ordenada, inclusive lidando com casos como números negativos, zeros à esquerda e ordens reversas de dígitos.

### Métodos

1. **Método `numberToWords`:**
    - Este método deve ter um parâmetro `int number`.
    - O objetivo é imprimir os dígitos do número em palavras. Por exemplo, 123 deve ser impresso como "One Two Three".
    - Se o número for negativo, imprima "Invalid Value".
    - Para evitar a impressão reversa (como "Four Three Two" ao invés de "Two Three Four"), use os dois outros métodos para reverter o número e calcular o número de dígitos corretamente.

2. **Método `reverse`:**
    - Este método deve ter um parâmetro `int number` e retornar o número revertido.
    - Exemplo:
        - `reverse(234)` deve retornar `432`.
        - `reverse(-121)` deve retornar `-121` (números negativos também devem ser tratados).

3. **Método `getDigitCount`:**
    - Este método deve contar quantos dígitos o número possui.
    - Caso o número seja negativo, deve retornar `-1` como valor inválido.
    - Exemplo:
        - `getDigitCount(123)` deve retornar `3`.
        - `getDigitCount(5200)` deve retornar `4`.

### Exemplos de Entrada/Saída

**Método `getDigitCount`:**
- `getDigitCount(0)` → deve retornar `1` (pois 0 possui 1 dígito).
- `getDigitCount(123)` → deve retornar `3`.
- `getDigitCount(-12)` → deve retornar `-1` (porque o número é negativo).
- `getDigitCount(5200)` → deve retornar `4`.

**Método `reverse`:**
- `reverse(-121)` → deve retornar `-121`.
- `reverse(1212)` → deve retornar `2121`.
- `reverse(1234)` → deve retornar `4321`.
- `reverse(100)` → deve retornar `1`.

**Método `numberToWords`:**
- `numberToWords(123)` → deve imprimir:
  ```
  One
  Two
  Three
  ```
- `numberToWords(1010)` → deve imprimir:
  ```
  One
  Zero
  One
  Zero
  ```
- `numberToWords(1000)` → deve imprimir:
  ```
  One
  Zero
  Zero
  Zero
  ```
- `numberToWords(-12)` → deve imprimir:
  ```
  Invalid Value
  ```

### Dicas:
- Utilize um laço `for` ou `while` para imprimir os zeros após reverter o número.
- Ao reverter o número, deve-se cuidar dos números com zeros à esquerda (como no exemplo de `100` que se torna `1`).
- Para realizar a conversão de números em palavras, você pode usar um array ou `switch` para mapear os dígitos para as palavras correspondentes.

---
## Exercício 25 — Gerenciamento de Requisitos de Pacotes de Farinha com Tamanhos de Balde Limitados

- **Descrição:**  
  Escreva um método chamado `canPack` com três parâmetros de tipo `int` chamados `bigCount`, `smallCount` e `goal`. O método deve verificar se é possível montar um pacote com exatamente a quantidade de quilos especificada pela variável `goal` usando os sacos de farinha grandes e pequenos disponíveis. Um saco grande pesa 5 quilos e um saco pequeno pesa 1 quilo.

### Parâmetros:

- `bigCount` (int): Número de sacos grandes (5 quilos cada).
- `smallCount` (int): Número de sacos pequenos (1 quilo cada).
- `goal` (int): Quantidade total de quilos de farinha necessários para formar o pacote.

### Regras de Implementação:

1. Se qualquer um dos parâmetros for negativo, o método deve retornar `false`.
2. A soma de todos os sacos (grandes e pequenos) deve ser maior ou igual à quantidade de `goal`.
3. Se a soma dos sacos for maior que o objetivo (`goal`), apenas sacos inteiros podem ser usados. Ou seja, um saco grande (5 quilos) não pode ser dividido.
4. Exemplo:
    - Se `goal` = 9, `bigCount` = 2, e `smallCount` = 0, o método deve retornar `false` porque, mesmo com 2 sacos grandes (10 quilos no total), não há sacos pequenos para alcançar exatamente 9 quilos.
    - Se `goal` = 9, `bigCount` = 1, e `smallCount` = 5, o método deve retornar `true` porque 1 saco grande (5 quilos) e 4 sacos pequenos (1 quilo cada) somam exatamente 9 quilos.

### Exemplos de Entrada/Saída:

**Exemplo 1:**
- Entrada: `canPack(1, 0, 4)`
- Saída: `false`
- Justificativa: O saco grande tem 5 quilos e não pode ser usado para atingir o objetivo de 4 quilos.

**Exemplo 2:**
- Entrada: `canPack(1, 0, 5)`
- Saída: `true`
- Justificativa: O saco grande de 5 quilos é exatamente o valor necessário para o objetivo de 5 quilos.

**Exemplo 3:**
- Entrada: `canPack(0, 5, 4)`
- Saída: `true`
- Justificativa: Usamos 4 sacos pequenos de 1 quilo para alcançar o objetivo de 4 quilos.

**Exemplo 4:**
- Entrada: `canPack(2, 2, 11)`
- Saída: `true`
- Justificativa: Com 2 sacos grandes (10 quilos) e 2 sacos pequenos (2 quilos), podemos atingir 11 quilos.

**Exemplo 5:**
- Entrada: `canPack(-3, 2, 12)`
- Saída: `false`
- Justificativa: O valor de `bigCount` é negativo, portanto o método retorna `false`.

### Dicas:
- Certifique-se de que a soma dos sacos grandes e pequenos seja suficiente para atingir ou superar o `goal`.
- Para atender ao requisito de "não dividir os sacos grandes", se necessário, use uma abordagem que subtraia os sacos grandes primeiro (por exemplo, calcular quantos sacos grandes podem ser usados para se aproximar do objetivo e, em seguida, usar os sacos pequenos para preencher a diferença).

---
## Exercício 26 — Identificando o Maior Fator Primo de um Número

- **Descrição:**  
  Escreva um método chamado `getLargestPrime` com um parâmetro do tipo `int` chamado `number`. O método deve calcular o maior fator primo de um número dado e retornar esse valor. Caso o número seja negativo ou não tenha fatores primos, o método deve retornar `-1` para indicar um valor inválido.

### Regras de Implementação:

1. Se o número for negativo ou se não tiver nenhum fator primo (como no caso de 0 ou 1), o método deve retornar `-1`.
2. O método deve calcular o maior fator primo de um número. Um fator primo é um número que pode dividir o número dado sem deixar um resto e é um número primo.
3. Exemplos de números e seus maiores fatores primos:
    - Para `21`, os fatores primos são `3` e `7`, então o maior fator primo é `7`.
    - Para `217`, os fatores primos são `7` e `31`, então o maior fator primo é `31`.
    - Para `45`, os fatores primos são `3` e `5`, então o maior fator primo é `5`.
    - Para `0` ou `1`, o método deve retornar `-1` pois esses números não têm fatores primos.

### Exemplos de Entrada/Saída:

**Exemplo 1:**
- Entrada: `getLargestPrime(21)`
- Saída: `7`
- Justificativa: O maior fator primo de 21 é `7`.

**Exemplo 2:**
- Entrada: `getLargestPrime(217)`
- Saída: `31`
- Justificativa: O maior fator primo de 217 é `31`.

**Exemplo 3:**
- Entrada: `getLargestPrime(0)`
- Saída: `-1`
- Justificativa: O número `0` não tem fatores primos, então o método retorna `-1`.

**Exemplo 4:**
- Entrada: `getLargestPrime(45)`
- Saída: `5`
- Justificativa: O maior fator primo de 45 é `5`.

**Exemplo 5:**
- Entrada: `getLargestPrime(-1)`
- Saída: `-1`
- Justificativa: O número é negativo, portanto o método retorna `-1`.

### Dicas:
- Para calcular os fatores primos de um número, você pode tentar dividir o número por valores começando de 2 até a raiz quadrada do número. Quando você encontrar um divisor, divida o número e continue dividindo até não ser mais divisível.
- Se, no final, o número restante for maior que 1, esse número será o maior fator primo.

---
## Exercício 27 — Construindo Um Padrão de Estrela Diagonal com Laços de Repetição

- **Descrição:**  
  Escreva um método chamado `printSquareStar` com um parâmetro do tipo `int` chamado `number`. O método deve imprimir um padrão retangular composto por estrelas (`*`). O número de linhas e colunas será determinado pelo valor de `number`.

  Se o valor de `number` for menor que 5, o método deve imprimir "Invalid Value".

### Regras de Implementação:

1. O padrão deve ter as estrelas formadas por quatro condições:
    - Na primeira ou na última linha
    - Na primeira ou na última coluna
    - Quando o número da linha for igual ao número da coluna
    - Quando a coluna for igual a `number - currentRow + 1` (onde `currentRow` é o número da linha atual)

2. **Exemplo 1:**
    - Para `number = 5`, o padrão impresso será:
   ```
   *****
   ** **
   * * *
   ** **
   *****
   ```

3. **Exemplo 2:**
    - Para `number = 8`, o padrão impresso será:
   ```
   ********
   **    **
   * *  * *
   *  **  *
   *  **  *
   * *  * *
   **    **
   ********
   ```

4. **Caso inválido:**
    - Se o valor de `number` for menor que 5, imprima "Invalid Value".

### Exemplos de Entrada/Saída:

**Exemplo 1:**
- Entrada: `printSquareStar(5)`
- Saída:
  ```
  *****
  ** **
  * * *
  ** **
  *****
  ```

**Exemplo 2:**
- Entrada: `printSquareStar(8)`
- Saída:
  ```
  ********
  **    **
  * *  * *
  *  **  *
  *  **  *
  * *  * *
  **    **
  ********
  ```

**Exemplo 3:**
- Entrada: `printSquareStar(3)`
- Saída: `Invalid Value`

### Dicas:
- Use um laço de repetição aninhado (um laço dentro de outro) para percorrer as linhas e as colunas.
- Para imprimir as estrelas e os espaços no mesmo linha, use `System.out.print()` para imprimir sem pular para a próxima linha.
- Para mover para a próxima linha, use `System.out.println()`.

---
## Exercício 28 — Calculadora Interativa de Soma e Média a Partir de Entrada do Usuário

- **Descrição:**  
  Escreva um método chamado `inputThenPrintSumAndAverage` que não tenha parâmetros. O método deve continuar lendo números inteiros do teclado até que o usuário insira algo que não seja um número inteiro.

  Quando o usuário inserir algo que não seja um número inteiro, o método deve imprimir a soma (`SUM`) e a média (`AVG`) de todos os números inteiros inseridos até aquele ponto.

  A média deve ser arredondada para o inteiro mais próximo utilizando o método `Math.round`.

### Requisitos de Implementação:
1. O método deve ler números inteiros a partir da entrada do teclado.
2. O processo de leitura e soma dos números deve continuar até o usuário inserir um valor que não seja um número inteiro (por exemplo, uma string).
3. Quando um valor não inteiro for inserido, o método deve imprimir a soma e a média dos números até aquele momento.
4. A média deve ser calculada como um número do tipo `long` e arredondada.

### Exemplo de Entrada/Saída:

**Exemplo 1:**
- **Entrada:**
  ```
  1
  2
  3
  4
  5
  a
  ```
- **Saída:**
  ```
  SUM = 15 AVG = 3
  ```

**Exemplo 2:**
- **Entrada:**
  ```
  hello
  ```
- **Saída:**
  ```
  SUM = 0 AVG = 0
  ```

### Dicas:
- Use a classe `Scanner` para ler a entrada do usuário.
- Para calcular a média, utilize o método `Math.round` para arredondar o valor para o inteiro mais próximo.
- Ao imprimir a soma e a média, tenha cuidado com os espaços entre as palavras e números.
- Se o usuário inserir um valor não inteiro logo de cara, a soma e a média devem ser `0`.

---
## Exercício 29 — Planejamento Eficiente de Tinta com Cálculo de Baldes

- **Descrição:**  
  Escreva três versões sobrecarregadas do método `getBucketCount` que ajudam Bob, o pintor de paredes, a calcular quantos baldes de tinta ele precisa comprar para pintar uma parede.



### Versão 1 — Quatro Parâmetros
**Assinatura:**  
`public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)`

**Parâmetros:**
- `width` (double) — largura da parede.
- `height` (double) — altura da parede.
- `areaPerBucket` (double) — área que um balde de tinta consegue cobrir.
- `extraBuckets` (int) — número de baldes disponíveis em casa.

**Validações:**
- Se `width` ≤ 0, `height` ≤ 0, `areaPerBucket` ≤ 0 ou `extraBuckets` < 0, retornar `-1`.

**Cálculo:**
- Calcular a área da parede: `width * height`
- Calcular quantos baldes são necessários: `Math.ceil(area / areaPerBucket)`
- Subtrair os `extraBuckets`.
- Retornar o número de baldes a comprar.

**Exemplos:**
- `getBucketCount(3.4, 2.1, 1.5, 2)` → retorna `3`
- `getBucketCount(-3.4, 2.1, 1.5, 2)` → retorna `-1`



### Versão 2 — Três Parâmetros
**Assinatura:**  
`public static int getBucketCount(double width, double height, double areaPerBucket)`

**Parâmetros:**
- `width` (double) — largura da parede.
- `height` (double) — altura da parede.
- `areaPerBucket` (double) — área que um balde de tinta consegue cobrir.

**Validações:**
- Se `width` ≤ 0, `height` ≤ 0 ou `areaPerBucket` ≤ 0, retornar `-1`.

**Cálculo:**
- Calcular a área da parede: `width * height`
- Calcular e retornar o número de baldes necessários com `Math.ceil(area / areaPerBucket)`

**Exemplos:**
- `getBucketCount(3.4, 2.1, 1.5)` → retorna `5`
- `getBucketCount(-3.4, 2.1, 1.5)` → retorna `-1`



### Versão 3 — Dois Parâmetros
**Assinatura:**  
`public static int getBucketCount(double area, double areaPerBucket)`

**Parâmetros:**
- `area` (double) — área total da parede.
- `areaPerBucket` (double) — área que um balde de tinta consegue cobrir.

**Validações:**
- Se `area` ≤ 0 ou `areaPerBucket` ≤ 0, retornar `-1`.

**Cálculo:**
- Calcular e retornar o número de baldes necessários com `Math.ceil(area / areaPerBucket)`

**Exemplos:**
- `getBucketCount(3.4, 1.5)` → retorna `3`
- `getBucketCount(6.26, 2.2)` → retorna `3`
- `getBucketCount(3.26, 0.75)` → retorna `5`



### Dicas:
- Utilize `Math.ceil` para arredondar o valor para cima antes de converter para `int`.
- Valide cuidadosamente os parâmetros em todas as versões do método.
- Todos os métodos devem ser `public static`.

---
# Seção 7: Mastering Java OOP: Classes & Inheritance

## Exercício 30 — Implementação de Calculadora Simples

- **Descrição:**  
  Crie uma classe chamada `SimpleCalculator` que representa uma calculadora básica capaz de realizar operações de soma, subtração, multiplicação e divisão entre dois números.



### Estrutura da Classe

**Campos:**
- `firstNumber` (double) — primeiro número.
- `secondNumber` (double) — segundo número.



### Métodos:

- `public double getFirstNumber()`  
  Retorna o valor de `firstNumber`.

- `public double getSecondNumber()`  
  Retorna o valor de `secondNumber`.

- `public void setFirstNumber(double firstNumber)`  
  Define o valor de `firstNumber`.

- `public void setSecondNumber(double secondNumber)`  
  Define o valor de `secondNumber`.

- `public double getAdditionResult()`  
  Retorna o resultado da soma entre `firstNumber` e `secondNumber`.

- `public double getSubtractionResult()`  
  Retorna o resultado da subtração de `secondNumber` de `firstNumber`.

- `public double getMultiplicationResult()`  
  Retorna o resultado da multiplicação entre `firstNumber` e `secondNumber`.

- `public double getDivisionResult()`  
  Retorna o resultado da divisão de `firstNumber` por `secondNumber`.  
  Se `secondNumber` for `0`, retorna `0`.



### Exemplo de Teste

```java
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
```

**Saída Esperada:**
```
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
```

### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **8 métodos** na classe.

---

## Exercício 31 — Classe Person e Validação de Idade

- **Descrição:**  
  Crie uma classe chamada `Person` que armazena informações básicas sobre uma pessoa, incluindo nome, sobrenome e idade. A classe também realiza validações e fornece métodos auxiliares.

### Estrutura da Classe

**Campos:**
- `firstName` (String) — primeiro nome da pessoa.
- `lastName` (String) — sobrenome da pessoa.
- `age` (int) — idade da pessoa.


### Métodos:

- `public String getFirstName()`  
  Retorna o valor de `firstName`.

- `public String getLastName()`  
  Retorna o valor de `lastName`.

- `public int getAge()`  
  Retorna o valor de `age`.

- `public void setFirstName(String firstName)`  
  Define o valor de `firstName`.

- `public void setLastName(String lastName)`  
  Define o valor de `lastName`.

- `public void setAge(int age)`  
  Define o valor de `age`.  
  Se o valor for menor que `0` ou maior que `100`, define `age = 0`.

- `public boolean isTeen()`  
  Retorna `true` se `age` estiver entre `13` e `19` (inclusive), senão retorna `false`.

- `public String getFullName()`  
  Retorna o nome completo da pessoa, conforme as regras:
    - Se ambos `firstName` e `lastName` estiverem vazios, retorna `""`.
    - Se apenas `lastName` estiver vazio, retorna `firstName`.
    - Se apenas `firstName` estiver vazio, retorna `lastName`.
    - Caso contrário, retorna `firstName + " " + lastName`.


### Exemplo de Teste

```java
Person person = new Person();
person.setFirstName("");   // firstName é vazio
person.setLastName("");    // lastName é vazio
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());

person.setFirstName("John");
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());

person.setLastName("Smith");
System.out.println("fullName= " + person.getFullName());
```

**Saída Esperada:**
```
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
```



### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **8 métodos** na classe.

---

## Exercício 32 — Cálculo da Área da Parede

- **Descrição:**  
  Crie uma classe chamada `Wall` que armazena as dimensões de uma parede e calcula sua área. A classe também deve realizar validações ao definir os valores de largura e altura.


### Estrutura da Classe

**Campos:**
- `width` (double) — largura da parede.
- `height` (double) — altura da parede.


### Construtores:

- `Wall()`  
  Construtor sem parâmetros. Inicializa os campos com os valores padrão (`0.0`).

- `Wall(double width, double height)`  
  Construtor que recebe dois parâmetros.
    - Se `width < 0`, define `width = 0`.
    - Se `height < 0`, define `height = 0`.


### Métodos:

- `public double getWidth()`  
  Retorna o valor de `width`.

- `public double getHeight()`  
  Retorna o valor de `height`.

- `public void setWidth(double width)`  
  Define o valor de `width`.  
  Se `width < 0`, define como `0`.

- `public void setHeight(double height)`  
  Define o valor de `height`.  
  Se `height < 0`, define como `0`.

- `public double getArea()`  
  Retorna a área da parede, calculada como `width * height`.


### Exemplo de Teste

```java
Wall wall = new Wall(5, 4);
System.out.println("area= " + wall.getArea());

wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
```

**Saída Esperada:**
```
area= 20.0
width= 5.0
height= 0.0
area= 0.0
```

### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **2 construtores** e **5 métodos**.

---

## Exercício 33 — Cálculo de Distância entre Pontos

- **Descrição:**  
  Crie uma classe chamada `Point` que representa um ponto no plano 2D com coordenadas inteiras `x` e `y`. A classe deve permitir calcular distâncias entre pontos utilizando a fórmula da distância euclidiana.


### Estrutura da Classe

**Campos:**
- `x` (int) — coordenada X.
- `y` (int) — coordenada Y.


### Construtores:

- `Point()`  
  Construtor sem parâmetros. Inicializa os campos `x` e `y` com valor 0.

- `Point(int x, int y)`  
  Construtor com parâmetros que inicializa os campos com os valores fornecidos.

### Métodos:

- `public int getX()`  
  Retorna o valor de `x`.

- `public int getY()`  
  Retorna o valor de `y`.

- `public void setX(int x)`  
  Define o valor de `x`.

- `public void setY(int y)`  
  Define o valor de `y`.

- `public double distance()`  
  Retorna a distância deste ponto até o ponto `(0, 0)`.

- `public double distance(Point another)`  
  Retorna a distância deste ponto até o ponto `another`.

- `public double distance(int x, int y)`  
  Retorna a distância deste ponto até o ponto com coordenadas `x`, `y`.

> **Fórmula da distância:**
 $$ \text{dist} = \sqrt{(x2 - x1)^2 + (y2 - y1)^2} $$


### Exemplo de Teste

```java
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
```

**Saída Esperada:**
```
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
```

### Observações:
- Utilize `Math.sqrt()` para cálculo de raiz quadrada.
- Evite código duplicado reutilizando métodos já implementados.
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **2 construtores** e **7 métodos**.

---

## Exercício 34 — Calculadora de Custo de Carpete

- **Descrição:**  
  Desenvolva uma aplicação que calcule o custo para cobrir um piso retangular com carpete. O valor total é calculado multiplicando a área do piso pelo custo por metro quadrado do carpete.


### 1. Classe `Floor`

**Campos:**
- `width` (double)
- `length` (double)

**Construtor:**
- `Floor(double width, double length)`  
  Inicializa os campos. Se `width < 0`, define como 0. Se `length < 0`, define como 0.

**Método:**
- `public double getArea()`  
  Retorna a área do piso (`width * length`).


### 2. Classe `Carpet`

**Campo:**
- `cost` (double)

**Construtor:**
- `Carpet(double cost)`  
  Inicializa o campo. Se `cost < 0`, define como 0.

**Método:**
- `public double getCost()`  
  Retorna o valor do campo `cost`.

### 3. Classe `Calculator`

**Campos:**
- `floor` (Floor)
- `carpet` (Carpet)

**Construtor:**
- `Calculator(Floor floor, Carpet carpet)`  
  Inicializa os campos.

**Método:**
- `public double getTotalCost()`  
  Retorna o custo total (`floor.getArea() * carpet.getCost()`).

### Exemplo de Teste

```java
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
```

**Saída Esperada:**
```
total= 38.5
total= 36.45
```

### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Cada classe deve estar em seu próprio arquivo.
- Total de **3 classes** e **5 métodos**.

---

## Exercício 35 — Operações com Números Complexos

- **Descrição:**  
  Um número complexo pode ser expresso na forma $( a + bi )$, onde $( a )$ e $( b )$ são números reais, e $( i )$ é uma solução da equação $( x^2 = -1 )$. Como nenhum número real satisfaz essa equação, $( i )$ é chamado de número imaginário. Para realizar operações de adição e subtração de números complexos, basta somar ou subtrair as partes reais e imaginárias correspondentes.


### 1. Classe `ComplexNumber`

**Campos:**
- `real` (double)
- `imaginary` (double)

**Construtor:**
- `ComplexNumber(double real, double imaginary)`  
  Inicializa os campos com os valores fornecidos para as partes real e imaginária.

**Métodos:**
- `public double getReal()`  
  Retorna o valor da parte real do número complexo.

- `public double getImaginary()`  
  Retorna o valor da parte imaginária do número complexo.

- `public void add(double real, double imaginary)`  
  Adiciona os valores fornecidos para a parte real e a parte imaginária ao número complexo.

- `public void add(ComplexNumber number)`  
  Adiciona outro número complexo ao número atual, somando suas partes reais e imaginárias.

- `public void subtract(double real, double imaginary)`  
  Subtrai os valores fornecidos para a parte real e a parte imaginária do número complexo.

- `public void subtract(ComplexNumber number)`  
  Subtrai outro número complexo do número atual, subtraindo suas partes reais e imaginárias.


### Exemplo de Teste

```java
ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1, 1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());
```

**Saída Esperada:**
```
one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0
```

### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **6 métodos**.

---

## Exercício 36 — Classe Círculo com Herança de Cilindro

- **Descrição:**  
  Este exercício envolve a criação de duas classes. A primeira, `Circle`, representa um círculo e a segunda, `Cylinder`, herda de `Circle` e representa um cilindro. O cilindro tem uma altura adicional que, combinada com a área do círculo, permite calcular o volume do cilindro.

### 1. Classe `Circle`

**Campos:**
- `radius` (double): Representa o raio do círculo.

**Construtor:**
- `Circle(double radius)`  
  Inicializa o campo `radius` com o valor fornecido. Caso o valor de `radius` seja negativo, o campo será configurado como 0.

**Métodos:**
- `public double getRadius()`  
  Retorna o valor do campo `radius`.

- `public double getArea()`  
  Retorna a área do círculo, calculada como \( \text{area} = \pi \times \text{radius}^2 \), usando a constante `Math.PI`.


### 2. Classe `Cylinder` (Herda de `Circle`)

**Campos:**
- `height` (double): Representa a altura do cilindro.

**Construtor:**
- `Cylinder(double radius, double height)`  
  Inicializa o campo `radius` através do construtor da classe pai `Circle`, e o campo `height` com o valor fornecido. Caso o valor de `height` seja negativo, o campo será configurado como 0.

**Métodos:**
- `public double getHeight()`  
  Retorna o valor do campo `height`.

- `public double getVolume()`  
  Retorna o volume do cilindro, calculado como \( \text{volume} = \text{area do círculo} \times \text{height} \).


### Exemplo de Teste

```java
Circle circle = new Circle(3.75);
System.out.println("circle.radius= " + circle.getRadius());
System.out.println("circle.area= " + circle.getArea());

Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius());
System.out.println("cylinder.height= " + cylinder.getHeight());
System.out.println("cylinder.area= " + cylinder.getArea());
System.out.println("cylinder.volume= " + cylinder.getVolume());
```

**Saída Esperada:**
```
circle.radius= 3.75
circle.area= 44.178646691106465
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447
```


### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **2 classes**.
- **Herança** é utilizada na classe `Cylinder`, que herda da classe `Circle`.

---

## Exercício 37 — Cálculo de Área e Volume de um Cubóide

- **Descrição:**  
  O objetivo deste exercício é calcular o volume de uma piscina com formato de cubóide, utilizando duas classes: `Rectangle` e `Cuboid`. A classe `Cuboid` herda da classe `Rectangle` e adiciona a dimensão `height` para calcular o volume.


### 1. Classe `Rectangle`

**Campos:**
- `width` (double): Representa a largura do retângulo.
- `length` (double): Representa o comprimento do retângulo.

**Construtor:**
- `Rectangle(double width, double length)`  
  Inicializa os campos `width` e `length` com os valores fornecidos. Caso o valor de `width` ou `length` seja negativo, o campo correspondente será configurado como 0.

**Métodos:**
- `public double getWidth()`  
  Retorna o valor do campo `width`.

- `public double getLength()`  
  Retorna o valor do campo `length`.

- `public double getArea()`  
  Retorna a área do retângulo, calculada como $( \text{area} = \text{width} \times \text{length} )$.


### 2. Classe `Cuboid` (Herda de `Rectangle`)

**Campos:**
- `height` (double): Representa a altura do cubóide.

**Construtor:**
- `Cuboid(double width, double length, double height)`  
  Inicializa os campos `width` e `length` através do construtor da classe `Rectangle`, e o campo `height` com o valor fornecido. Caso o valor de `height` seja negativo, o campo será configurado como 0.

**Métodos:**
- `public double getHeight()`  
  Retorna o valor do campo `height`.

- `public double getVolume()`  
  Retorna o volume do cubóide, calculado como $( \text{volume} = \text{area do retângulo} \times \text{height} )$.


### Exemplo de Teste

```java
Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());

Cuboid cuboid = new Cuboid(5, 10, 5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());
```

**Saída Esperada:**
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

### Observações:
- Todos os métodos devem ser `public`.
- Nenhum método deve ser `static`.
- Total de **2 classes**.
- **Herança** é utilizada na classe `Cuboid`, que herda da classe `Rectangle`.

---

# Seção 8: Advanced OOP Techniques: Composition, Encapsulation, and Polymorphism in Action

## Exercício 38 — Composição de Classes: Quarto com Cama, Lâmpada e Paredes

- **Descrição:**  
  Neste exercício, o objetivo é praticar a **composição de classes** em Java. Você criará cinco classes relacionadas a um quarto: `Lamp`, `Bed`, `Ceiling`, `Wall` e `Bedroom`, e utilizará composição para montar uma estrutura de cômodo.


### 1. Classe `Lamp`

**Campos (privados):**
- `style` (String)
- `battery` (boolean)
- `globRating` (int)

**Construtor:**
- `Lamp(String style, boolean battery, int globRating)`

**Métodos:**
- `public void turnOn()` → imprime `"Lamp -> Turning on"`
- `public String getStyle()`
- `public boolean isBattery()`
- `public int getGlobRating()`


### 2. Classe `Bed`

**Campos (privados):**
- `style` (String)
- `pillows`, `height`, `sheets`, `quilt` (int)

**Construtor:**
- `Bed(String style, int pillows, int height, int sheets, int quilt)`

**Métodos:**
- `public void make()` → imprime `"Bed -> Making | "`
- `public String getStyle()`
- `public int getPillows()`
- `public int getHeight()`
- `public int getSheets()`
- `public int getQuilt()`


### 3. Classe `Ceiling`

**Campos (privados):**
- `height` (int)
- `paintedColor` (int)

**Construtor:**
- `Ceiling(int height, int paintedColor)`

**Métodos:**
- `public int getHeight()`
- `public int getPaintedColor()`

### 4. Classe `Wall`

**Campo (privado):**
- `direction` (String)

**Construtor:**
- `Wall(String direction)`

**Método:**
- `public String getDirection()`

### 5. Classe `Bedroom`

**Campos (privados):**
- `name` (String)
- `wall1`, `wall2`, `wall3`, `wall4` (Wall)
- `ceiling` (Ceiling)
- `bed` (Bed)
- `lamp` (Lamp)

**Construtor:**
- `Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp)`

**Métodos:**
- `public Lamp getLamp()`
- `public void makeBed()` → imprime `"Bedroom -> Making bed | "` e chama `bed.make()`

### Exemplo de Teste

```java
Wall wall1 = new Wall("West");
Wall wall2 = new Wall("East");
Wall wall3 = new Wall("South");
Wall wall4 = new Wall("North");

Ceiling ceiling = new Ceiling(12, 55);

Bed bed = new Bed("Modern", 4, 3, 2, 1);

Lamp lamp = new Lamp("Classic", false, 75);

Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
bedRoom.makeBed();

bedRoom.getLamp().turnOn();
```

**Saída Esperada:**
```
Bedroom -> Making bed | Bed -> Making | Lamp -> Turning on
```

### Observações:
- Todos os campos devem ser privados.
- Todos os métodos devem ser `public` (não estáticos).
- Cada classe deve estar em seu próprio arquivo (`Lamp.java`, `Bed.java`, etc).
- Utilize **composição**, não herança.

---

## Exercício 39 — Impressora com Encapsulamento: Toner e Impressão Duplex

- **Descrição:**  
  O objetivo deste exercício é reforçar o uso do **encapsulamento** em Java, criando uma classe `Printer` com lógica para adicionar toner, imprimir páginas (inclusive em modo duplex) e acompanhar o total de páginas impressas.

### Classe `Printer`

**Campos (privados):**
- `int tonerLevel`
- `int pagesPrinted`
- `boolean duplex`

### Construtor:

```java
Printer(int tonerLevel, boolean duplex)
```

- Inicializa o campo `tonerLevel` **somente se** o valor estiver entre 0 e 100 (inclusive). Caso contrário, define `tonerLevel = -1`.
- Define `duplex` com base no parâmetro.
- Inicializa `pagesPrinted` como 0.

### Métodos:

#### `public int addToner(int tonerAmount)`
- Retorna `-1` se `tonerAmount` for menor ou igual a 0, ou maior que 100.
- Se `tonerLevel + tonerAmount` ultrapassar 100, retorna `-1`.
- Caso contrário, adiciona o valor ao nível de toner atual e retorna o novo `tonerLevel`.

#### `public int printPages(int pages)`
- Cria uma variável local `pagesToPrint` com valor igual ao parâmetro `pages`.
- Se `duplex == true`, imprime mensagem `"Printing in duplex mode"` e divide `pagesToPrint` por 2, somando 1 se `pages` for ímpar (usando `%`).
- Soma `pagesToPrint` ao campo `pagesPrinted`.
- Retorna `pagesToPrint`.

#### `public int getPagesPrinted()`
- Retorna o valor atual de `pagesPrinted`.

### Exemplo de Teste

```java
Printer printer = new Printer(50, true);
System.out.println(printer.addToner(50));
System.out.println("initial page count = " + printer.getPagesPrinted());
int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
```

### Saída Esperada:

```
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
```

### Observações:
- Todos os campos devem ser `private`.
- Todos os métodos devem ser `public` (e **não** `static`).
- Utilize operações matemáticas (`/` e `%`) para calcular as páginas em modo duplex.

---

## Exercício 40 — Polimorfismo: Classes de Veículos

### Descrição:
Neste exercício, você vai criar uma hierarquia de classes de veículos. A classe `Car` será a classe base, e três classes derivadas, `Mitsubishi`, `Ford` e `Holden`, irão sobrescrever métodos da classe base.

### Classes:

#### 1) Classe `Car`:
- **Campos privados:**
    - `engine` (boolean)
    - `cylinders` (int)
    - `name` (String)
    - `wheels` (int)

- **Construtor:**
    - O construtor da classe `Car` recebe dois parâmetros: `cylinders` (int) e `name` (String).
    - A classe `Car` possui um motor (`engine = true`) e 4 rodas por padrão (`wheels = 4`).

- **Métodos:**
    - `startEngine()`: Retorna uma mensagem indicando que o motor está sendo ligado.
    - `accelerate()`: Retorna uma mensagem indicando que o carro está acelerando.
    - `brake()`: Retorna uma mensagem indicando que o carro está freando.
    - `getCylinders()`: Retorna o número de cilindros.
    - `getName()`: Retorna o nome do carro.

#### 2) Subclasses de `Car`:
As classes `Mitsubishi`, `Ford` e `Holden` herdam a classe `Car`. Cada uma delas deve sobrescrever os métodos `startEngine()`, `accelerate()` e `brake()` para retornar mensagens específicas para o tipo de carro.


### Exemplo de Execução:

```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
```

### Saída Esperada:

```
Car -> startEngine()
Car -> accelerate()
Car -> brake()
Mitsubishi -> startEngine()
Mitsubishi -> accelerate()
Mitsubishi -> brake()
Ford -> startEngine()
Ford -> accelerate()
Ford -> brake()
Holden -> startEngine()
Holden -> accelerate()
Holden -> brake()
```

### Observações:
- O uso de **polimorfismo** permite que o método sobrescrito seja chamado com base no tipo da instância do objeto (Mitsubishi, Ford, Holden), mesmo que a referência seja de tipo `Car`.
- Lembre-se de **não incluir o método `main`** nas classes que serão avaliadas. Apenas os métodos de cada classe devem ser submetidos.

---




