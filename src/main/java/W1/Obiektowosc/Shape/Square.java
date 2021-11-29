package W1.Obiektowosc.Shape;

public class Square extends Rectangle {


    public Square() {
        this.height = 1;
        this.width = 1;
    }

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);

    }


}
