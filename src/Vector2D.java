public class Vector2D implements IVector{
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double[] getComponents() {
        double[] components = {x, y};
        return components;
    }

    @Override
    public double[] getAngles() {
        double[] angles = {Math.toDegrees(Math.atan(y/x))};
        return angles;
    }

    @Override
    public double cdot(IVector vector) {
        return x * vector.getComponents()[0] + y * this.getComponents()[1];
    }

    @Override
    public String toString() {
        return "[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
