

# Exercício: Programa 'Número de Dias no Mês'

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para calcular o número de dias em um mês, considerando o ano bissexto:

- `isLeapYear(int year)`:
    - Verifica se o ano é bissexto.
    - Um ano é bissexto se for divisível por 4, mas não por 100, ou se for divisível por 400.

- `getDaysInMonth(int month, int year)`:
    - Retorna o número de dias no mês, considerando o ano bissexto.
    - Se os parâmetros forem inválidos, retorna `-1`.

## Código

### NumberOfDaysInMonth.java
```java
public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year) {

        if(year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static int getDaysInMonth (int month, int year) {
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }

        boolean isLeapYear =  isLeapYear(year);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
        }

        return -1;
    }
}
```

### MainExerc14.java
```java
public class MainExerc14 {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc14`.
3. Veja os resultados no console, que indicam o número de dias para o mês e ano informados.

---