public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width * height);
    }

    public double getWidth() {
        return width;
    }

    public Wall setWidth(double width) {
        this.width = width < 0 ? 0 : width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Wall setHeight(double height) {
        this.height = height < 0 ? 0 : height;
        return this;
    }
}
