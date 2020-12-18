public class DecoratorVector3D implements IVector{
    private Vector3D vector3D;

    public DecoratorVector3D(Vector3D vector3D) {
        this.vector3D = vector3D;
    }

    @Override
    public double abs() {
        return vector3D.abs();
    }

    @Override
    public double[] getComponents() {
        return vector3D.getComponents();
    }

    @Override
    public double[] getAngles() {
        return vector3D.getAngles();
    }

    @Override
    public double cdot(IVector vector) {
        return vector.cdot(vector);
    }

    public Vector3D calculateVectorProduct(Vector3D v) {
        double[] componentVector3D = vector3D.getComponents();
        double[] componentV =  v.getComponents();
        return new Vector3D(componentVector3D[1]*componentV[2] - componentVector3D[2]*componentV[1],
                componentVector3D[2]*componentV[0]-componentVector3D[0]*componentV[2],
                componentVector3D[0]*componentV[1]-componentVector3D[1]*componentV[0]);
    }
}
