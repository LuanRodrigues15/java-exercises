import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        System.out.println("Enter whole numbers. To finish, enter anything that is not a number.");

        while(true) {
            System.out.print("Number: ");
            boolean hasNextInt = sc.hasNextInt();

            if(!hasNextInt) {
                break;
            }

            sum += sc.nextInt();
            count++;
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        sc.close();
    }
}