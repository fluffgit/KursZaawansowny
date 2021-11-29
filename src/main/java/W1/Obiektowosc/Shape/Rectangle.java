package W1.Obiektowosc.Shape;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

    Rectangle() {
        this.color = "unknown";
        this.isFilled = false;
        this.width = 1;
        this.height = 1;
    }

    Rectangle(String color, boolean isFilled, double width, double height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean isFilled, double height) {
        this.color = color;
        this.height = height;
        this.isFilled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimieter() {
        return height * 2 + width * 2;
    }

    @Override
    public String toString() {
        return String.format("%s %b %.2f %.2f", color, isFilled, width, height);
    }

}
