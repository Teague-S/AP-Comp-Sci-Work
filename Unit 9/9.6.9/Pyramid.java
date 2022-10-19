import java.lang.Math;

public class Pyramid extends Solid {
    private int baseLength;
    private int baseWidth;
    private int height;

    public Pyramid(String name, int bl, int bw, int h) {
        super(name);
        baseLength = bl;
        baseWidth = bw;
        height = h;
    }

    @Override
    public double volume() {
        return ((baseLength * baseWidth * height) / 3.0);
    }

    @Override
    public double surfaceArea() {
        return (double) ((baseLength * baseWidth)
                + (baseLength * (Math.sqrt(Math.pow((baseWidth / 2.0), 2) + Math.pow(height, 2)))
                        + (baseWidth * Math.sqrt(Math.pow((baseLength / 2.0), 2) + Math.pow(height, 2)))));
    }
    // Code goes here
}