public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        String type = getClass().getSimpleName();
        return type + " -> startEngine()";
    }

    public String accelerate() {
        String type = getClass().getSimpleName();
        return type + " -> accelerate()";
    }

    public String brake() {
        String type = getClass().getSimpleName();
        return type + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
