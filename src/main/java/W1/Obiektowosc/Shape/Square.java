package W1.Obiektowosc.Shape;

public class Square extends Rectangle {




    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);

    }

    @Override
    public void setHeight(double size) {
        this.width =size;
        this.height =size;
    }

    @Override
    public void setWidth(double size) {
        this.width =size;
        this.height =size;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimieter() {
        return this.height*2+this.width*2;
    }
}
