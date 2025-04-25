public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB, KB;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        } else {
            MB = kiloBytes / 1024;
            KB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+ MB +" MB and " + KB + " KB");
        }
    }
}
