# Toner and Duplex Printing Exercise

## Descrição

Este exercício implementa uma classe `Printer` que simula o funcionamento de uma impressora com controle de toner, contagem de páginas e opção de impressão duplex (frente e verso). A lógica foi projetada para reforçar o conceito de encapsulamento em Java.

## Código

### Printer.java

```java
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        String printDuplex = (duplex) ? "Printing in duplex mode" : "Printing in normal mode";
        System.out.println(printDuplex);
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
```

### MainExerc39.java

```java
public class MainExerc39 {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + 
            " new total print count for printer = " + printer.getPagesPrinted());
        
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + 
            " new total print count for printer = " + printer.getPagesPrinted());
    }
}
```

## Como Executar

1. Compile os arquivos `Printer.java` e `MainExerc39.java`.
2. Execute a classe `MainExerc39`.
3. Observe a saída informando o modo de impressão, o total de páginas impressas e o nível de toner.