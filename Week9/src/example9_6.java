import java.awt.geom.Point2D;
import java.util.Scanner;

public class example9_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D.Double(x1, y1); // 使用 Point2D.Double
        Point2D p2 = new Point2D.Double(x2, y2); // 使用 Point2D.Double

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());

        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
    }
}