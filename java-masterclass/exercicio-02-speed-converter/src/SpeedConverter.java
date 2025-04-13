public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilotersPerHour) {
        if (kilotersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilotersPerHour);
        System.out.println(kilotersPerHour + "km/h = " + milesPerHour + " mi/h");
    }

}
