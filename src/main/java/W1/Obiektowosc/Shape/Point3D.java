package W1.Obiektowosc.Shape;

import W1.Obiektowosc.Shape.Point2D;

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

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    public void setXYZ(float x, float y, float z) {
        SetXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}
