public class AdapterVector implements IVector {
    private IVector iVector;

    public AdapterVector(double r, double[] angle) {
        if (angle.length == 1) {
            this.iVector = new Vector2D(r * Math.cos(Math.toRadians(angle[0])),
                    r * Math.sin(Math.toRadians(angle[0])));
        } else if (angle.length == 2) {
            this.iVector = new Vector3D(r * Math.cos(Math.toRadians(angle[1])) * Math.cos(Math.toRadians(angle[0])),
                    r * Math.cos(Math.toRadians(angle[1])) * Math.sin(Math.toRadians(angle[0])),
                    r * Math.sin(Math.toRadians(angle[1])));
        }
    }

    @Override
    public double abs() {
        return iVector.abs();
    }

    @Override
    public double[] getComponents() {
        return iVector.getComponents();
    }

    @Override
    public double[] getAngles() {
        return iVector.getAngles();
    }

    @Override
    public double cdot(IVector vector) {
        return iVector.cdot(vector);
    }

    @Override
    public String toString() {
        return iVector.toString();
    }
}
