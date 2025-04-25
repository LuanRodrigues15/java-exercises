public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sumDivisor = 0;

        for (int i = 1; i < num; i++) {

            if ((num % i) == 0) {
                sumDivisor += i;
            }
        }

        return (sumDivisor == num);
    }
}