public class Rectangle {

    private final double width;

    private final double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double Area(){
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
