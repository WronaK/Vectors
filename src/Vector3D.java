public class Vector3D extends Vector2D{
    public double z;

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs() {
        return Math.sqrt(super.abs()*super.abs()+z*z);
    }

    @Override
    public double[] getComponents() {
        double[] components = {super.getComponents()[0], super.getComponents()[1], z};
        return components;
    }

    @Override
    public double[] getAngles() {
        double[] angles = {super.getAngles()[0],
                Math.toDegrees(Math.asin(z/this.abs()))};
        return angles;
    }

    @Override
    public double cdot(IVector vector) {
        return super.cdot(vector) + z * vector.getComponents()[2];
    }

    @Override
    public String toString() {
        return "[" +
                "x=" + this.getComponents()[0] +
                ", y=" + this.getComponents()[1] +
                " z=" + z +
                ']';
    }
}