package W1.Obiektowosc.Shape;

public class Line extends Point2D {

    protected Point2D point1;
    protected Point2D point2;

    Line(Point2D point1, Point2D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    Line(float x, float y, float x2, float y2) {
        this.point1 = new Point2D(x, y);
        this.point2 = new Point2D(x2, y2);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public double distance(Point2D point11, Point2D point22) {
        return Math.sqrt((point11.getX() - point22.getX()) * (point11.x - point22.getX()) + ((point11.y - point22.getY()) * (point11.y - point22.getY())));
    }

    @Override
    public String toString() {
        return point1.toString() + " " + point2.toString();
    }
}
