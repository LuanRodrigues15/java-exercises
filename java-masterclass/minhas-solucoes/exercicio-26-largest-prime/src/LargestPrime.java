public class LargestPrime {

    public static int getLargestPrime(int num) {
        if (num < 2) {
            return -1;
        }

        int factor = -1;

        for (int i = 2; Math.sqrt(i) <= num; i++) {
            if (num % i != 0) {
                continue;
            }

            factor = i;

            while (num % i == 0) {
                num /= i;
            }
        }

        return num == 1 ? factor : num;
    }
}