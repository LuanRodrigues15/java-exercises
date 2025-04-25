


# Input Calculator

## Descrição
Este exercício implementa um método chamado `inputThenPrintSumAndAverage` que realiza a leitura interativa de números inteiros digitados pelo usuário através do teclado. A leitura continua até que o usuário digite um valor que não seja um número inteiro.

Ao final, o programa exibe a soma de todos os números digitados e a média aritmética arredondada, seguindo o formato:
```
SUM = XX AVG = YY
```
Onde:
- `XX` é a soma de todos os números inteiros lidos.
- `YY` é a média desses números, calculada como `long`.

Se nenhum número for inserido, a soma e a média serão consideradas como `0`.

## Código

### InputCalculator.java
```java
import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        System.out.println("Enter whole numbers. To finish, enter anything that is not a number.");

        while(true) {
            System.out.print("Number: ");
            boolean hasNextInt = sc.hasNextInt();

            if(!hasNextInt) {
                break;
            }

            sum += sc.nextInt();
            count++;
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        sc.close();
    }
}
```

## Como executar
1. Compile o programa:
   ```
   javac InputCalculator.java
   ```
2. Execute:
   ```
   java InputCalculator
   ```
3. Digite números inteiros. Para finalizar, insira qualquer valor não numérico (ex.: letra ou símbolo).
4. O resultado será exibido no formato `SUM = XX AVG = YY`.

---

