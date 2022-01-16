package LAB150122.zadanie9;

import java.util.ArrayList;
import java.util.List;


public class Circle implements Movable{

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        return Math.sqrt((point.getY()-center.getY())*(point.getY()-center.getY())+(point.getX()-center.getX())*(point.getX()-center.getX()));
    }

    public double getPerimeter(){
        return 2* Math.PI*getRadius();
    }

    public double getArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }

    public List<Point2D> getSlicePoints(){
        List<Point2D> lista = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int angle = (int)(Math.random()*360);
            double x = Math.cos(angle)*getRadius();
            double y = Math.sin(angle)*getRadius();;
            lista.add(new Point2D(x,y));
        }
        return lista;
    }


    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);



    }

    @Override
    public String toString() {
        return String.format("<%f.%f>",center.getX(),center.getY());
    }
}
