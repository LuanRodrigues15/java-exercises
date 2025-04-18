public class SumOddRange {

    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd (int start, int end) {
        int sumOdd = 0;

        if(start < 0 || end < 0 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sumOdd += i;
            }
        }

        return sumOdd;
    }
}
