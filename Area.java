class Area{
     double area;

    Area(double radius) {
        this.area = calculateCircleArea(radius);
    }

    Area(double radius, double height) {
        this.area = calculateConeArea(radius, height);
    }

    Area(double radius, double height, boolean isCylinder) {
        if (isCylinder) {
            this.area = calculateCylinderArea(radius, height);
        } else {
            this.area = calculateConeArea(radius, height);
        }
    }

    public double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    public double calculateConeArea(double radius, double height) {
        return 3.14 * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    public double calculateCylinderArea(double radius, double height) {
        return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
    }

    public double getArea() {
        return area;
    }
}

public class Area1 {
    public static void main(String[] args) {
        Area circle = new Area(5.0);
        System.out.println("Area of Circle: " + circle.getArea());

        Area cone = new Area(4.0, 7.0);
        System.out.println("Area of Cone: " + cone.getArea());

        Area cylinder = new Area(3.0, 8.0, true);
        System.out.println(" Area of Cylinder: " + cylinder.getArea());
    }
}