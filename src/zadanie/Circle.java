package zadanie;

public class Circle extends Figura {

    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void show() {
        super.show();
        System.out.print(" - " + name + ", " + area());
    }

}
