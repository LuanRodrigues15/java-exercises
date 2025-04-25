public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        int intNumber1 = (int) (number1 * 1000);
        int intNumber2 = (int) (number2 * 1000);

        return (intNumber1 == intNumber2);
    }
}
