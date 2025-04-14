
---

# Exercício: Programa 'Cachorro Latindo'

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar se o cachorro está latindo e se é hora de acordar:

- `shouldWakeUp(boolean barking, int hourOfDay)`:
    - Se o cachorro está latindo e o horário é antes das 8 ou depois das 22 horas, deve retornar `true` (precisa acordar).
    - Se o horário for inválido (menor que 0 ou maior que 23), deve retornar `false`.
    - Caso contrário, retorna `false` (não precisa acordar).

## Código

### BarkingDog.java
```java
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8) || (hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
```

### MainExerc04.java
```java
public class MainExerc04 {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc04`.
3. Veja as respostas no console.

---
