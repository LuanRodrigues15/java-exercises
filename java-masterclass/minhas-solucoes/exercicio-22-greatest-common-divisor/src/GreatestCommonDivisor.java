public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int rest = 0;

        while (second != 0) {
            rest = second;
            second = first % second;
            first = rest;
        }

        return first;
    }
}