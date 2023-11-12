import java.util.Scanner;
public class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle() {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    boolean validate() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return false;
        }
        return true;
    }

    double findArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double findPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        Triangle t1 = new Triangle(side1, side2, side3);
        System.out.println("Validation: " + t1.validate());
        System.out.println("Area: " + t1.findArea());
        System.out.println("Perimeter: " + t1.findPerimeter());
    }
}