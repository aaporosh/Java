interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Usage:
public class area{
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(6, 9);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Shape triangle = new Triangle(4, 8);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}

