package punkty;

public class Point3D extends Point2D {

    private double z;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void showCoordinates() {
        super.showCoordinates();
        System.out.println("z: " + z);
    }
}
