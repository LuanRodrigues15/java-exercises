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




