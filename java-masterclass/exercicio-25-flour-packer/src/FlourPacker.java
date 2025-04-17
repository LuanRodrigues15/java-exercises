public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * 5;

        if (totalBigWeight >= goal) {
            int remaning = goal % 5;
            if (smallCount >= remaning) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }

        return result;
    }
}