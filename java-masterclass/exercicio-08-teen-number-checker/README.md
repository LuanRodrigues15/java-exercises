

# Exercício: Verificador de Idade Adolescentes

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar se algum dos três números (idades) está no intervalo de idade "teen" (13 a 19, inclusive):

- `hasTeen(int age1, int age2, int age3)`:
    - Retorna `true` se um dos números estiver no intervalo de 13 a 19 (inclusive). Caso contrário, retorna `false`.

## Código

### TeenNumberChecker.java
```java
public class TeenNumberChecker {
    public static boolean hasTeen (int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen (int age) {
        return (age >= 13 && age <= 19);
    }
}
```

### MainExerc08.java
```java
public class MainExerc08 {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc08`.
3. Veja as respostas no console.

---