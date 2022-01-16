package W1.Obiektowosc.Shape;

import W1.Obiektowosc.Shape.Point2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point3D extends Point2D {

    protected float z;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

//    public float[] getXYZ() {
//        float[] tab= new float[3];
//        float[] tab2= getXY();
//        tab[0] = tab2[0];
//        tab[1] = tab2[1];
//        tab[2] = z;
//        return tab;
//    }

//    public List<Float> getXYZ() {
//        List<Float> lista = new ArrayList<>(Arrays.asList(getXY()));
//        lista.add(z);
//        return  lista;
//    }

    public List<Float> getXYZ() {
        List<Float> lista = new ArrayList<>();
        lista.add(z);
        return  lista;
    }

    public void setXYZ(float x, float y, float z) {
        SetXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
