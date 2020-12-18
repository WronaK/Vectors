import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(4.5, 3.5);
        System.out.println("v1 = " + v1);
        System.out.println("Kąty biegunowe = " + v1.getAngles()[0]);
        System.out.println("Moduł wektora = " + v1.abs());

        System.out.println("------------------------------------------------------");
        Vector2D v2= new Vector2D(-2.5, 8.9);
        System.out.println("v2 = " + v2);
        System.out.println("Kąty biegunowe = " + v2.getAngles()[0]);
        System.out.println("Moduł wektora = " + v2.abs());

        System.out.println("------------------------------------------------------");
        IVector va1 = new AdapterVector(9.244457799135654, new double[]{-74.31000707091613});
        System.out.println("Wektor stworzony przy pomocy współrzędnych biegunowych: va1 = " + va1);
        System.out.println("Składowe wektora 'va1' = x: " + va1.getComponents()[0] + ", y: " + va1.getComponents()[1]);

        System.out.println("------------------------------------------------------");
        IVector va2 = new AdapterVector(5.70087712549569,  new double[]{37.8749836510982});
        System.out.println("Wektor stworzony przy pomocy współrzędnych biegunowych: va2 = " + va2);

        System.out.println("------------------------------------------------------");
        System.out.println("Iloczyn skalarny wektorow v1 i v2 = " + v1.cdot(v2));

        System.out.println("------------------------------------------------------");
        Vector3D v3 = new Vector3D(4.5, 3.5, 6.7);
        System.out.println("v3 = " + v3);
        System.out.println("Kąty biegunowe = [" + v3.getAngles()[0] + ", " + v3.getAngles()[1] + "]");
        System.out.println("Moduł wektora = " + v3.abs());

        System.out.println("------------------------------------------------------");
        Vector3D v4 = new Vector3D(-2.5, 8.9, 5.6);
        System.out.println("v4 = " + v4);
        System.out.println("Kąty biegunowe = [" + v4.getAngles()[0] + ", " + v4.getAngles()[1] + "]");
        System.out.println("Moduł wektora = " + v4.abs());

        System.out.println("------------------------------------------------------");
        IVector va3 = new AdapterVector(10.808330120791094, new double[]{-74.31000707091613, 31.206154707955196});
        System.out.println("Wektor stworzony przy pomocy współrzędnych biegunowych: va1 = " + va3);
        System.out.println("Składowe wektora 'va3' = x: " + va3.getComponents()[0] + "," +
                " y: " + va3.getComponents()[1] + ", z: " + va3.getComponents()[2]);

        System.out.println("------------------------------------------------------");
        IVector va4 = new AdapterVector(8.79715863219483, new double[]{37.8749836510982, 49.60629818540004});
        System.out.println("Wektor stworzony przy pomocy współrzędnych biegunowych: va4 = " + va4);

        System.out.println("------------------------------------------------------");
        System.out.println("Iloczyn skalarny wektorow v3 i v4 = " + v3.cdot(v4));

        System.out.println("------------------------------------------------------");
        Vector3D v5 = new Vector3D(2, 3, 4);
        System.out.println("v5 = " + v5);
        Vector3D v6 = new Vector3D(5,4,3);
        System.out.println("v6 = " + v6);
        DecoratorVector3D vector = new DecoratorVector3D(v5);
        System.out.println("Iloczyn wektorowy wektorów v5 i v6 = " + vector.calculateVectorProduct(v6));
    }

}
