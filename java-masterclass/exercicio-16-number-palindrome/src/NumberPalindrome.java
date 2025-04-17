public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int original = number;

        // Convert number to positive for correct reversal
        number = Math.abs(number);

        while (number != 0) {
            int lastDigit = number % 10;  // Extract last digit
            reverse = (reverse * 10) + lastDigit; // Build reversed number
            number /= 10; // Remove last digit
        }

        // Compare the reversed number with the original (ignoring signs)
        return reverse == Math.abs(original);
    }
}