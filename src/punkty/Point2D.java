package punkty;

public class Point2D {

    protected double x;
    protected double y;


    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void showCoordinates() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
