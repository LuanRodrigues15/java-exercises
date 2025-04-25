
# Exercício: Verificador de Soma Igual

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar se a soma de dois números é igual ao terceiro número:

- `hasEqualSum(int num1, int num2, int num3)`:
    - Retorna `true` se a soma de `num1` e `num2` for igual a `num3`, caso contrário, retorna `false`.

## Código

### EqualSumChecker.java
```java
public class EqualSumChecker {
    public static boolean hasEqualSum (int num1, int num2, int num3) {
        boolean result =  ((num1 + num2) == num3) ? true : false;
        return result;
    }
}
```

### MainExerc07.java
```java
public class MainExerc07 {
    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc07`.
3. Veja as respostas no console.

---