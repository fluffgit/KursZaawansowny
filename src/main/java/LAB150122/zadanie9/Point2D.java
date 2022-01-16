package LAB150122.zadanie9;

public class Point2D implements Movable{
    private double x;
    private double y;

    //get slice point 4 dowolne piunkty z okregu

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("<%f.%f>",x,y);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x += moveDirection.getX();
        this.y += moveDirection.getY();


    }
}
