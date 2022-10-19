import java.lang.Math;

public class Sphere extends Solid {
    private int radius;

    public Sphere(String n, int r) {
        super(n);
        radius = r;
    }

    // Code goes here
    @Override
    public double volume() {
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}