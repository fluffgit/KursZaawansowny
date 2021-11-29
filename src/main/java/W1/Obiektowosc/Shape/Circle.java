package W1.Obiektowosc.Shape;

import java.security.PublicKey;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.radius = 1;
    }


    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimieter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("%s %b %.2f", color, isFilled, radius);
    }

}
