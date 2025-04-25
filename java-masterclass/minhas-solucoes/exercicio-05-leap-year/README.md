

# Exercício: Calculadora de Ano Bissexto

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar se um ano é bissexto:

- `isLeapYear(int year)`:
    - Se o ano for menor que 1 ou maior que 9999, deve retornar `false`.
    - Caso contrário, verifica se o ano é divisível por 4, mas não por 100, a menos que seja divisível por 400.
    - Se o ano for bissexto, retorna `true`, caso contrário, retorna `false`.

## Código

### LeapYear.java
```java
public class LeapYear {
    public static boolean isLeapYear(int year) {
        if((year < 1 ) || (year > 9999)) {
            return false;
        }

        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
```

### MainExerc05.java
```java
public class MainExerc05 {
    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc05`.
3. Veja as respostas no console.

---