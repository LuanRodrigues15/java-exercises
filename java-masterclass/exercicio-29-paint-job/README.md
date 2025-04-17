# Exercício: Efficient Paint Job Planning With Bucket Calculations

## Descrição

Este exercício implementa um programa para ajudar Bob, o pintor, a calcular quantos baldes de tinta ele precisa comprar antes de começar o trabalho. A lógica leva em consideração a área da parede, o rendimento de cada balde e a quantidade de baldes que Bob já possui.

Foram criadas três versões sobrecarregadas do método `getBucketCount`:
- **Versão 1:** Recebe `width`, `height`, `areaPerBucket` e `extraBuckets`.
- **Versão 2:** Recebe `width`, `height` e `areaPerBucket`.
- **Versão 3:** Recebe `area` e `areaPerBucket`.

O método retorna `-1` para qualquer valor inválido (valores menores ou iguais a zero).

## Código

### PaintJob.java

```java
public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        area -= (areaPerBucket * extraBuckets);

        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;

        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);

        return bucketsNeeded;
    }
}
```

### MainExerc29.java

```java
public class MainExerc29 {

    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
    }
}
```

## Instruções para Execução

1. Certifique-se de ter o Java instalado e configurado no ambiente.
2. Salve os códigos acima em arquivos chamados `PaintJob.java` e `MainExerc29.java`.
3. Compile ambos:
   ```
   javac PaintJob.java MainExerc29.java
   ```
4. Execute:
   ```
   java MainExerc29
   ```
5. Observe o resultado no console.