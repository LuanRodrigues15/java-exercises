public class MainExerc38 {
    public static void main(String[] args) {

        Walls wall1 = new Walls("North");
        Walls wall2 = new Walls("South");
        Walls wall3 = new Walls("East");
        Walls wall4 = new Walls("West");

        System.out.println("Walls:");
        System.out.println("Wall 1: " + wall1.getDirection());
        System.out.println("Wall 2: " + wall2.getDirection());
        System.out.println("Wall 3: " + wall3.getDirection());
        System.out.println("Wall 4: " + wall4.getDirection());

        Ceiling ceiling = new Ceiling(12, 255);
        System.out.println("\nCeiling:");
        System.out.println("Height: " + ceiling.getHeight() + "ft");
        System.out.println("Painted color: " + ceiling.getPaintedColor());

        Bed bed = new Bed("Rustic", 4, 2, 2, 1);
        System.out.println("\nBed:");
        System.out.println("Style: " + bed.getStyle());
        System.out.println("Pillows: " + bed.getPillows());
        System.out.println("Height: " + bed.getHeight());
        System.out.println("Sheets: " + bed.getSheets());
        System.out.println("Quilt: " + bed.getQuilt());

        System.out.print("Making the bed... ");
        bed.make();
        System.out.println();

        Lamp lamp = new Lamp("Vintage", true, 60);
        System.out.println("\nLamp:");
        System.out.println("Style: " + lamp.getStyle());
        System.out.println("Uses battery: " + lamp.isBattery());
        System.out.println("Glob rating: " + lamp.getGlobRating());

        System.out.print("Turning on the lamp... ");
        lamp.turnOn();
        System.out.println();
    }
}
