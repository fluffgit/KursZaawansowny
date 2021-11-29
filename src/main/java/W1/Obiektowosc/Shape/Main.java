package W1.Obiektowosc.Shape;

public class Main {

    public static void main(String[] args) {


//        Circle cir1 = new Circle();
//        Circle cir2 = new Circle("red",true,5.4);
//        System.out.println(cir1);
//        System.out.println(cir2);
//
//
//        Rectangle rect1 = new Rectangle();
//        Rectangle rect2 = new Rectangle("blue",false,10.13,2.4);
//        System.out.println(rect1);
//        System.out.println(rect2);
//
//        System.out.printf("%.2f%n",rect2.getArea());
//
//
//        Square sq1 = new Square();
//        Square sq2 = new Square("yellow",false,4);
//        System.out.println(sq1);
//        System.out.println(sq2);
//
//        System.out.printf("%.2f%n",sq2.getArea());


        Line line1 = new Line(new Point2D(1, 2), new Point2D(3, 4));
        Line line2 = new Line(5, 6, 7, 8);

        System.out.println(line1.getPoint1());
        System.out.println(line1.getPoint2());

        System.out.println(line2.getPoint1());
        System.out.println(line2.getPoint2());

        double dist = line1.distance(new Point2D(2, 0), new Point2D(0, 2));
        System.out.println(dist);
        System.out.println(line1);


    }

}
