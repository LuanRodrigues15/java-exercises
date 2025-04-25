public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean sharedDigit = false;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (true) {
            if ((num1 % 10) == (num2 % 10) || (num1 % 10) == (num2 /= 10) || (num1 /= 10) == (num2 % 10)) {
                sharedDigit = true;
                break;
            } else {
                sharedDigit = false;
                break;
            }

        }

        return sharedDigit;
    }
}

