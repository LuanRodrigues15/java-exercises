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


