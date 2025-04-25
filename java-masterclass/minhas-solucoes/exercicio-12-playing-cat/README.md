

# Exercício: Programa 'Gato Brincando'

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para verificar se o gato está brincando com base na temperatura e na estação:

- `isCatPlaying(boolean summer, int temperature)`:
    - Se **não for verão**, o gato brinca se a temperatura estiver entre **25 e 35 (inclusive)**.
    - Se **for verão**, o gato brinca se a temperatura estiver entre **25 e 45 (inclusive)**.
    - Retorna `true` se o gato estiver brincando, senão `false`.

## Código

### PlayingCat.java
```java
public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if ((temperature >= 25 && temperature <= 35) || (summer && (temperature >= 25 && temperature <= 45))) {
            return true;
        } else {
            return false;
        }
    }
}
```

### MainExerc12.java
```java
public class MainExerc12 {
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc12`.
3. Veja as respostas no console.

---