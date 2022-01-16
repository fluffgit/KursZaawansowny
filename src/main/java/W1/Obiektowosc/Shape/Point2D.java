package W1.Obiektowosc.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point2D {

    protected float x;
    protected float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public List<Float> getXY() {
        List<Float> lista = new ArrayList<>();
        lista.add(x);
        lista.add(y);
        return  lista;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void SetXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
