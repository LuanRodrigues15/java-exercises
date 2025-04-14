# Exercício: Conversor de MegaBytes

Exercício realizado no curso **Java Masterclass 2025** da Udemy.

## Descrição

Crie um método para converter **quilobytes (KB)** em **megabytes (MB)** e **quilobytes restantes**:

- `printMegaBytesAndKiloBytes(int kiloBytes)`: calcula a quantidade de megabytes e o restante em kilobytes a partir do valor recebido.
    - Exibe no formato: `XX KB = YY MB and ZZ KB`.
    - Caso o valor seja menor que 0, exibe: `"Invalid Value"`.

## Código

### MegaBytesConverter.java
```java
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB, KB;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        } else {
            MB = kiloBytes / 1024;
            KB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+ MB +" MB and " + KB + " KB");
        }
    }
}
```

### MainExerc03.java
```java
public class MainExerc03 {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
```

## Como Executar

1. Compile os arquivos `.java`.
2. Execute a classe `MainExerc03`.
3. Veja as conversões de KB para MB e KB no console.

---