package LAB150122.zadanie9;

public class zadanie9 {

    public static void main(String[] args) {

//        Point2D point2 = new Point2D(0,0);
//        System.out.println(point2);
//        point2.move(new MoveDirection(-2,2));
//        point2.move(new MoveDirection(-2,2));
//        System.out.println(point2);

        Circle circle =  new Circle(new Point2D(0,0),new Point2D(-2,0));

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getSlicePoints());

        System.out.println(circle);
        circle.move(new MoveDirection(1,0));
        circle.move(new MoveDirection(1,3));

        System.out.println(circle);

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getSlicePoints());





    }
}
