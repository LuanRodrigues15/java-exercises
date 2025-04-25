public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int digits = 0;
        int evenNumber = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            digits = number % 10;
            if (digits % 2 == 0) {
                evenNumber += digits;
            }
            number /= 10;
        }

        return evenNumber;


    }
}