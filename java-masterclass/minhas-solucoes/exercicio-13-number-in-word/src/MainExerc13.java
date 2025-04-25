import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExerc13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.println("Digite um número de 0-9 para ver seu nome em inglês ou digite -1 para sair");
                System.out.print("Digite: ");
                number = Integer.parseInt(sc.nextLine());

                if (number == -1) {
                    System.out.println("Sistema finalizado.");
                    break;
                } else {
                    NumberInWord.printNumberInWord(number);
                }

            } catch (NumberFormatException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }
}

