public class RectangularPrism extends Solid {
    private int length;
    private int width;
    private int height;

    public RectangularPrism(String n, int l, int w, int h) {
        super(n);
        length = l;
        width = w;
        height = h;
    }

    // Code goes here
    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (width * length + height * length + height * width);
    }
}