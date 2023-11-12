class Rectangle {
    private double length;
    private double width;
    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(double side) {
        length = side;
        width = side;
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double calculateArea() {
        return length * width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();              
        Rectangle rectangle2 = new Rectangle(5.0);           
        Rectangle rectangle3 = new Rectangle(4.0, 6.0);      
        System.out.println("Rectangle 1 - Area: " + rectangle1.calculateArea() + ", Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle 2 - Area: " + rectangle2.calculateArea() + ", Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Rectangle 3 - Area: " + rectangle3.calculateArea() + ", Perimeter: " + rectangle3.calculatePerimeter());
    }
}